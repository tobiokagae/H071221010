package Tugas03;

import java.util.Scanner;
public class Nomor03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User Aclisung = new User("Acli", 50_000);

        Product esTeh = new Product("Es teh panas", 5_000, 10);
        Product pizza = new Product("Pizza       ", 123_000, 2);
        Product naskun = new Product("Nasi kuning ", 10_000, 12);
        Product nasgor = new Product("Nasi goreng ", "10K", 3);
        
        Store kantin = new Store("Kantin Salah Jadi");
        
        kantin.tambahProduk(esTeh);
        kantin.tambahProduk(pizza);
        kantin.tambahProduk(naskun);
        kantin.tambahProduk(nasgor);
        
        while (true) {
            Aclisung.card();
            kantin.listProduk();
            System.out.println("O. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();
            if (pilihan <= 0) {
                break;
            }else if(pilihan > kantin.products.size()){
                System.out.println("Tidak ada dalam pilihan");
                continue;
            }else {
                kantin.konfirmasi(pilihan - 1);//konfirmasi pembelian
            }
            System.out.print("> ");
            int pilih = input.nextInt();
            if (pilih == 1) {
                kantin.transaksi(pilihan - 1, Aclisung);
                System.out.print("> ");
                int pilihan2 = input.nextInt();
                if (pilihan2 == 1) {
                    continue;
                } else {
                    break; //jika transaksi tidak dilanjut maka program akan keluar
                }
            } else { //jika konfirmasi batal maka program akan berjalan terus (menampilkan list produk)
                continue;
            }
        }
        input.close();
    }

}
