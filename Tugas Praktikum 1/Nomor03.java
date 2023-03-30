package Tugas01;

import java.util.Scanner;
public class Nomor03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            //input nama
            System.out.print("Nama : ");
            String nama = inp.nextLine();
            //input umur
            System.out.print("Umur : ");
            int umur = inp.nextInt();
            inp.nextLine();
            //input hobi
            System.out.print("Hobi : ");
            String Hobby = inp.nextLine();
            //print output
            System.out.println("Nama saya " + nama + ", " + umur + " tahun," + " hobby " + Hobby);
        } catch (Exception e) {
            //inputan umur bukan angka
            System.out.println("Bukan Angka");
        }
        inp.close();
    }
}
