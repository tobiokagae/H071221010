package Tugas01;
import java.util.Scanner;

public class Nomor08 {
    public static void main(String[] args) {
      int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
      //buat array sesuai soal
      Scanner inp = new Scanner(System.in);
      System.out.print("Masukkan angka yang dicari: ");
      int angka = inp.nextInt();
      inp.close();
      boolean found = false;
      // yg nilainya true atau false
  
      try {
        for (int i = 0; i < arr.length; i++) {
          // perulangan untuk dimensi pertama
          for (int j = 0; j < arr[i].length; j++) {
            // perulangan untuk dimensi kedua
            if (arr[i][j] == angka) {
              // kalau nilai inputnya sama dgn stiap elemen dri array maka outpuotnya
              System.out.printf("Found %d at [%d][%d]\n", angka, i, j);
              // %d itu nilai int di print format
              found = true;
              // klau kita input yg ada di array maka dia true klau dia tdk ada maka hasilnya false
            }
          }
        }
        if (!found) {
          // klau tdk found maka true,jika true maka blok kode yg ada di catch akan di eksekusi
          throw new Exception();
        }
      } catch (Exception e) {
        System.out.printf("%d tidak ditemukan dalam array.\n", angka);
      }
    }
  }