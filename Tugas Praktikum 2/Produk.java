package Tugas02;

public class Produk {
    String id;
    String nama;
    int stok;
    int harga;

    public void setId(String id) {
        this.id = id;
    }
    String getId() {
        return this.id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    String getNama() {
        return this.nama;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    int getStok() {
        return this.stok;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    int getHarga() {
        return this.harga;
    }

    //menampilkan informasi produk
    void detail() {
        System.out.println("ID Produk   : " + id);
        System.out.println("Nama Produk : " + nama);  
        System.out.println("Stok        : " + stok);
        System.out.println("Harga       : " + harga);
        if (stok <= 0) {
            System.out.println("Stok habis.");
        } else {
            System.out.println("Stok tersedia.");
        }
    }
}