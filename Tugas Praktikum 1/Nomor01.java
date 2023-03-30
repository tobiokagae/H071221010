 package Tugas01;

import java.util.Scanner;
public class Nomor01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //input nim
        System.out.print("NIM : ");
        String nim = inp.nextLine();
        //tiga angka belakang nim
        int NIM = Integer.parseInt(nim.substring(nim.length()-3));
        int soal;
        //pengkondisian
        if (NIM % 7 == 0) {
            soal = 7;
        } else {
            soal = NIM % 7;
        }
        //print output
        System.out.println("Soal : No. " + soal);
        inp.close();
    }
}