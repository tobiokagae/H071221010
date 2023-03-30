package Tugas01;
import java.util.Scanner;
public class Nomor02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //jumlah awal bil. bulat dan bil. desimal
        int bilbul = 0;
        int bildes = 0;
        try {
            //input banyak angka
            System.out.print("Jumlah angka : ");
            int n = inp.nextInt();
            inp.nextLine();

            System.out.print("Input " + n + " angka : ");
            for (int i = 0; i < n; i++) {
                //input angka
                double angka = inp.nextDouble();
                //pengkondisian
                if (angka % 1 == 0) {
                    bilbul++;
                } else {
                    bildes++;
                }
            }
            //print output
            System.out.println(bilbul + " Bilangan Bulat");
            System.out.println(bildes + " Bilangan Desimal");
        } catch (Exception e) {
            //input bukan angka
            System.out.println("Input harus berupa bilangan!");
        }
        inp.close();
    }
}