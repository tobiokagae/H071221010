package Tugas02;

public class Nomor03 {
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        produk1.setId("A01");
        produk1.setNama("Indomie");
        produk1.setStok(0);
        produk1.setHarga(3000);
        produk1.detail();
        Produk produk2 = new Produk();
        produk2.setId("B01");
        produk2.setNama("Ultra Milk Chocolate");
        produk2.setStok(10);
        produk2.setHarga(6500);
        produk2.detail();
    }
}
