package Tugas05;
import java.util.Scanner;

public class MainBangun {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(5, 6, 7);
        Bola bola = new Bola(14);
        Tabung tabung = new Tabung(14, 24);
        detailBangunRuang();
        
        System.out.print("> ");
        int pilihan2 = inp.nextInt();
        inp.nextLine();
        switch (pilihan2) {
            case 1:
                System.out.println("Luas Permukaan = " + String.format("%.2f", kubus.luasPermukaan()));
                System.out.println("Volume         = " + String.format("%.2f", kubus.volume()));
                break;
            case 2:
                System.out.println("Luas Permukaan = " + String.format("%.2f", balok.luasPermukaan()));
                System.out.println("Volume         = " + String.format("%.2f", balok.volume()));
                break;
            case 3:
                System.out.println("Luas Permukaan = " + String.format("%.2f", bola.luasPermukaan()));
                System.out.println("Volume         = " + String.format("%.2f", bola.volume()));
                break;
            case 4:
                System.out.println("Luas Permukaan = " + String.format("%.2f", tabung.luasPermukaan()));
                System.out.println("Volume         = " + String.format("%.2f", tabung.volume()));
                break;
            default:
                System.out.println("INPUTAN TIDAK VALID");
                break;
        }

        Persegi persegi = new Persegi(5);
        persegiPanjang persegip = new persegiPanjang(5, 4);
        Lingkaran lingkaran = new Lingkaran(14);
        Segitiga segitiga = new Segitiga(12, 7, 10, 11);
        Trapesium trapesium = new Trapesium(4, 5, 3, 3, 2);
        detailBangunDatar();

        System.out.print("> ");
        int pilihan3 = inp.nextInt();
        inp.nextLine();
        switch (pilihan3) {
            case 1:
                System.out.println("Luas        = " + String.format("%.2f", persegi.luas()));
                System.out.println("Keliling    = " + String.format("%.2f", persegi.keliling()));
                break;
            case 2:
                System.out.println("Luas        = " + String.format("%.2f", persegip.luas()));
                System.out.println("Keliling    = " + String.format("%.2f", persegip.keliling()));
                break;
            case 3:
                System.out.println("Luas        = " + String.format("%.2f", lingkaran.luas()));
                System.out.println("Keliling    = " + String.format("%.2f", lingkaran.keliling()));
                break;
            case 4:
                System.out.println("Luas        = " + String.format("%.2f", segitiga.luas()));
                System.out.println("Keliling    = " + String.format("%.2f", segitiga.keliling()));
                break;
            case 5:
                System.out.println("Luas        = " + String.format("%.2f", trapesium.luas()));
                System.out.println("Keliling    = " + String.format("%.2f", trapesium.keliling()));
                break;
            default:
                System.out.println("INPUTAN TIDAK VALID");
                break;
        }
        inp.close();
    }
    
    public static void detailBangunRuang() {
        System.out.println("======= BANGUN RUANG =======");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
    }
    public static void detailBangunDatar() {
        System.out.println("======= BANGUN DATAR =======");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. LINGKARAN");
        System.out.println("4. SEGITIGA");
        System.out.println("5. TRAPESIUM");
    }

}
