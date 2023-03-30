package Tugas01;
import java.util.Scanner;
public class Nomor05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String tbh = inp.nextLine();
        String[] tbh2 = tbh.split("-");
        int[] tbh3 = new int[3];
        for (int i = 0; i < tbh2.length; i++) {
            tbh3[i] = Integer.parseInt(tbh2[i]);
        }
        String tahun = "";
        if (tbh3[2] >= 0 && tbh3[2] < 24) {
            tahun = "20" + tbh2[2];
        } else {
            tahun = "19" + tbh2[2];
        }
        System.out.println(tbh3[0] + " " + konversiBulan(tbh3[1]) + " " + tahun);
        inp.close();
    }
    public static String konversiBulan(int angka){
        if (angka == 1) {
            return "Januari";
        } else if (angka == 2) {
            return "Februari";
        } else if (angka == 3) {
            return "Maret";
        } else if (angka == 4) {
            return "April";
        } else if (angka == 5) {
            return "Mei";
        } else if (angka == 6) {
            return "Juni";
        } else if (angka == 7) {
            return "Juli";
        } else if (angka == 8) {
            return "Agustus";
        } else if (angka == 9) {
            return "September";
        } else if (angka == 10) {
            return "Oktober";
        } else if (angka == 11) {
            return "November";
        } else if (angka == 12) {
            return "Desember";
        } else {
            return "";
        }
    }
}