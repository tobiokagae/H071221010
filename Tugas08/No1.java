import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class No1 {
    int jumlahData;
    int nomorThread;
    List<Integer> loadedData;
    List<Integer> failedData;

    public No1(int jumlahData, int nomorThread) {
        this.jumlahData = jumlahData;
        this.nomorThread = nomorThread;
        this.loadedData = new ArrayList<>();
        this.failedData = new ArrayList<>();
    }

    public void start() {
        //mencetak pesan untuk memberi tahu bahwa proses pengambilan data telah dimulai
        System.out.println("Start load " + jumlahData + " Data.\n");
        //ExecutorService digunakan untuk mengelola pool thread dan mengatur penjadwalan tugas. 
        //FixedThreadPool adalah salah satu jenis thread pool di mana ukuran pool tetap selama program berjalan.
        //mengembalikan instance dari ExecutorService dengan jumlah thread tetap sesuai dengan parameter nomorThread
        ExecutorService executor = Executors.newFixedThreadPool(nomorThread);
        //for digunakan untuk membuat sebanyak jumlahData instance dari LoadDataTask dan menjalankannya menggunakan thread pool 
        //dengan memanggil metode execute() pada instance ExecutorService.
        for (int i = 0; i < jumlahData; i++) {
            executor.execute(new LoadDataTask(i));
        }
        //untuk menghentikan semua thread yang berjalan pada thread pool setelah task selesai dijalankan.
        executor.shutdown();

        // Membuat UI Thread untuk tampilan yang memungkinkan 
        // dimulai dengan menjalankan method run() yang terdapat pada objek UIThread()
        Thread uiThread = new Thread(new UIThread());
        uiThread.start();
        
        //untuk memeriksa apakah semua task telah selesi dieksekusi atau belum
        //loop akan berjalan jika nilianya false dan akan berhenti jika nilainya true
        while (!executor.isTerminated()) {
            try {
                //jika task belum selesai maka program akan menjeda selama 1 detik sebelum melanjutkan ke iterasi berikutnya.
                Thread.sleep(1000);
                //jika terjadi kesalahan maka akan ditangkap oleh block catch dan mencetak trace dari exception (kesalahan) ke output standar.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Menunggu hingga UI Thread selesai
        try {
            //untuk memastikan bahwa program menunggu hingga semua tugas pengambilan data selesai dieksekusi sebelum mencetak output hasil eksekusi program.
            uiThread.join();
             //jika terjadi kesalahan maka akan ditangkap oleh block catch dan mencetak trace dari exception (kesalahan) ke output standar.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //executorservice
    private class LoadDataTask implements Runnable {
        private int sourceId;
        //mengeksekusi sebuah task yang memuat data dari sourceid
        public LoadDataTask(int sourceId) {
            this.sourceId = sourceId;
        }

        @Override
        public void run() {
            // task time adalah waktu loading datanya
            int taskTime = TaskTimeHelper.generateTaskTime();//method yang mengembalikan waktu acak (dalam detik) yang dibutuhkan untuk memuat data dari sumber yang diberikan.
            try {
                //digunakan untuk menunda eksekusi thread selama waktu yang dihasilkan oleh generateTaskTime().
                Thread.sleep(taskTime * 1000);
                //Setelah waktu yang dihasilkan oleh generateTaskTime() telah berlalu, maka data akan dimuat ke dalam loadedData.
                //Jika ada kesalahan atau interupsi ketika thread sedang tidur, maka sourceId akan ditambahkan ke failedData.
            } catch (InterruptedException e) {
                e.printStackTrace();
                // failedData.add(sourceId);
            }
            //jika waktu muat data melebihi tastime taitu 4 maka akan dicetak request time out di console dan souncied akan ditambahkan ke failed data
            if (taskTime > 4) {
                System.out.println("Request Timeout");
                failedData.add(sourceId);
            } else {
                loadedData.add(sourceId);
            }
        }
    }

    private static class TaskTimeHelper {
        public static int generateTaskTime() {
            Random rand = new Random();
            return rand.nextInt(6) + 1;
        }
    }

    private class UIThread implements Runnable {
        @Override
        public void run() {
            // nilai awal waktu loading data
            int totalTime = 0;
            //kondisi  untuk mengecek jumlah data yang berhasil diambil 
            //dan data yang gagal diambil lebih kecil dari jumlah data 
            while (loadedData.size() + failedData.size() < jumlahData) {
                try {
                    //jika kondisi memenuhi sebuah thread akan berjalan dan kemudian  total time akan bertambah 1
                    Thread.sleep(1000);
                    totalTime++;
                    //mencetak status pengambilan data ke console. 
                    System.out.println("Loading... (" + totalTime + "s)");
                } catch (InterruptedException e) {
                    //jika terjadi kesalahan maka akan ditangkap oleh block catch dan mencetak trace dari exception (kesalahan) ke output standar.
                    e.printStackTrace();
                }
            }

            int totalLoaded = loadedData.size();//total data yang berhasil diload
            int totalFailed = failedData.size();//total data yang failed

            //kondisi jika failed data lebih dari 0 
            if (totalFailed > 0) {
                System.out.println("\nTask Finish.\nTime Execution: " + totalTime + "s\n\n"
                        + totalLoaded + " Data Successfully Loaded & " + totalFailed + " Data failed to load.\n");
            } else {
                //kondisi jika tidak ada failed data
                System.out.println("\nTask Finish.\nTime Execution: " + totalTime + "s\nAll data is successfully loaded\n");
            }
        }
    }

    public static void main(String[] args) {
        No1 dataLoader = new No1(4, 3);
        //Method start akan memulai eksekusi dari program yang diimplementasikan oleh no1.
        dataLoader.start();
    }
}