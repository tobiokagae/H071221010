package Tugas03;

import java.util.ArrayList;
public class Store {
    String name;
    ArrayList<Product> products = new ArrayList<Product>();
    int a;
    public Store(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    public void tambahProduk(Product barang) {
        products.add(barang);
    }
    public void listProduk() {
        System.out.println("Selamat datang di " + this.name);
        System.out.println("Daftar Menu : ");
        for (int i = 0; i < products.size(); i++) {
            Product barang = products.get(i);
            System.out.printf("%d. %s - Rp%d | Stok %d\n", i + 1, barang.getName(), barang.getPrice(), barang.getStock());
        }
    }
    public void konfirmasi(int n) {
        Product barang = products.get(n);
        System.out.printf("Apakah anda yakin ingin membeli %s, dengan harga $%d\n", barang.getName(),barang.getPrice());
        System.out.println("1.Konfirmasi");
        System.out.println("2.Batal");
    }
    public void transaksi(int n, User user) {
        Product barang = products.get(n);
        if (user.getBalance() >= barang.getPrice()) {
            System.out.printf("%s berhasil membeli %s.\n", user.getName(), barang.getName());
            System.out.println("--------------------");
            System.out.println("Lanjutkan Transaksi");
            System.out.println("1. iya");
            System.out.println("2. tidak");
            barang.jualProduk(); //untuk mengurangi jumlah stok barang yang sudah terjual
            user.setBalance(user.getBalance() - barang.getPrice());
            if (barang.getStock() <= 0) {
                products.remove(barang);
            }
        } else {
            System.out.printf("Uang tidak cukup, Sisa uang anda : %d%n", user.getBalance());
            System.out.printf("%s gagal membeli %s.\n", user.getName(), barang.getName());
            System.out.println("--------------------");
            System.out.println("Lanjutkan Transaksi");
            System.out.println("1. iya");
            System.out.println("2. tidak");
        }
    }
}
