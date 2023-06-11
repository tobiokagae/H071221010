import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, Double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    private void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }
    //variable howLongToType yang memuat waktu yang diperlukan typer untuk menulis 1 kata dalam milisecond
    @Override
    public void run() {
        //array kata
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        //perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType
        // untuk menghitung berapa waktu yang diperlukan untuk mengetik satu kata dalam milidetik.
        int howLongToType = (int) (60000 / wpm);

        // iterasi melalui setiap kata dalam array wordsToType.
        for (String words : wordsToType) {
            try {
                //memberikan jeda antara setiap kata yang diketik sesuai dengan waktu yang telah dihitung sebelumnya (how long totype)
                Thread.sleep(howLongToType);
                // menambahkan kata yang telah diketik ke objek saat ini.
                this.addWordTyped(words);
                //Menangkap pengecualian jika thread saat ini terganggu oleh interupsi selama tidur dan mencetak jejak stack pengecualian.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //Tambahkan typer yang telah selesai mengetik semua kata ke list typeRaceTabel  yang ada di class typeRacer
        //Menambahkan kata "(selesai)" ke objek saat ini setelah semua kata dalam array wordsToType selesai diketik.
        this.addWordTyped("(selesai)");
        //menyimpan hasil pengetikan dan menghitung peringkat pengguna dalam permainan "Type Racer".
        typeRacer.addResult(this);
    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

class TypeRacer {
    private String wordsToType;//string yang menyimpan kata-kata yang harus diketik dalam permainan.
    private ArrayList<Typer> raceContestant = new ArrayList<>();// ArrayList yang menyimpan objek Typer yang merupakan peserta dalam perlombaan.
    private ArrayList<Result> raceStanding = new ArrayList<>();//ArrayList yang menyimpan objek Result yang merupakan peringkat peserta berdasarkan waktu pengetikan.

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // word by Yusuf Syam, silahkan diubah jika kurang bijak
    private String[] wordsToTypeList = { "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan danmenginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai" };
    //Digunakan untuk mengatur wordsToType dengan memilih secara acak satu elemen dari wordsToTypeList
    public void setNewWordsToType() {
        //  objek Random untuk menghasilkan angka acak antara 0 dan 9, dan kemudian memilih kalimat yang sesuai dari wordsToTypeList menggunakan angka acak sebagai indeks.
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    // Parameter Typer typer: Merupakan objek peserta (Typer) yang akan ditambahkan hasil pengetikannya ke peringkat.
    public void addResult(Typer typer) {
        //typer.getWpm(): Mengambil kecepatan pengetikan peserta (Typer) dalam kata per menit (wpm).
        //(60000 / typer.getWpm()): Menghitung waktu yang dibutuhkan untuk mengetik satu kata dalam milidetik.
        //typer.getWordsTyped().split(" ").length: Mengambil kata-kata yang telah diketik oleh peserta (Typer), membaginya menjadi array kata-kata berdasarkan spasi, dan menghitung jumlah kata yang telah diketik.
        int waktu = (int) (60000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length;
        //Membuat objek Result yang berisi nama peserta (Typer) dan waktu yang dibutuhkan untuk mengetik semua kata.
        Result result = new Result(typer.getBotName(), waktu);
       //Menambahkan objek Result ke dalam peringkat perlombaan
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasmen Akhir Type Racer");
        System.out.println("=========================\n");
       //Melakukan iterasi melalui elemen-elemen dalam ArrayList raceStanding, yang berisi objek Result yang mewakili peringkat peserta dalam perlombaan.
        for (int i = 0; i < raceStanding.size(); i++) {
            // Mengambil waktu penyelesaian dari objek Result yang dalam perulangan
            //getFinishTime() digunakan untuk mengambil waktu penyelesaian dalam bentuk bilangan bulat.
            int timeint = raceStanding.get(i).getFinishTime();
            // //Mengkonversi waktu penyelesaian dari milidetik menjadi detik dengan membaginya dengan 1000.0. Hasilnya disimpan dalam variabel timefix sebagai tipe data double.
            double timeFix = timeint / 1000.0;

             //Mencetak hasil klasemen untuk setiap peserta
            System.out.println(String.format("%d. %s = %.2f detik", i + 1, raceStanding.get(i).getName(), timeFix));
        }
    }
    
    //method untuk memulai perlombaan pengetikan setiap peserta
    public void startRace() {
        //Mengatur kata-kata yang harus diketik dengan memilih secara acak satu kata dari wordsToTypeList
        this.setNewWordsToType();
        for (Typer typerss : raceContestant) {
            //typerss.start();: Memulai pengetikan oleh setiap peserta dengan memanggil metode start(). Ini akan menjalankan metode run() dalam setiap objek Typer secara paralel dalam thread terpisah.
            typerss.start();
        }

        //variabel  untuk menentukan apakah semua peserta telah selesai mengetik.
        Boolean isFinish = false;
        while (true) {
            //Jika semua peserta telah selesai mengetik, maka loop akan dihentikan dengan menggunakan pernyataan break.
            if (isFinish) {
                break;
            } else {
                //kondisi Jika jumlah peserta yang telah selesai mengetik  
                //tidak sama dengan jumlah total peserta 
                if (raceStanding.size() != raceContestant.size()) {
                    try {
                        //Thread.sleep(1000);: Memberikan jeda selama 1 detik untuk memperlambat pengecekan kemajuan penge
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Typing Progress....");
                    System.out.println("===================");
                   //Mencetak nama peserta dan kata-kata yang telah diketik oleh peserta.
                    for (Typer pembalap : raceContestant) {
                        System.out.println(
                        String.format("- %s  =>  %s", pembalap.getBotName(), pembalap.getWordsTyped()));
                    }
                } else {
                    isFinish = true;
                }
            }
        }
        //Setelah loop selesai, metode printRaceStanding() dipanggil untuk mencetak klasemen akhir perlombaan.
        this.printRaceStanding();
    }
}

public class No2 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[1] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70.0, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
