package Tugas02;

public class Nomor05 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Ikhsan";
        mahasiswa.nim = "H071191049";

        System.out.println("Nama    : " + mahasiswa.getNama());
        System.out.println("NIM     : " + mahasiswa.getNim());
        System.out.println("Alamat  : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}