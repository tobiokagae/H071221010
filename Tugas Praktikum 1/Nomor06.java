package Tugas01;
import java.util.Scanner;
public class Nomor06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            //input jari-jari
            System.out.print("r = ");
            double r = inp.nextDouble();
            //hitung luas
            double luas = Math.PI*r*r;
            //print output
            System.out.println("Luas = " + String.format("%.2f", luas));
        } catch (Exception e) {
            //inputan bukan angka
            System.out.println("Inputan Bukan Angka");
        }
        inp.close();
    }
}
