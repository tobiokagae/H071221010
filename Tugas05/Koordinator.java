package Tugas05;

public class Koordinator extends Programmer {
    public Koordinator(String nama, String nim, int angkatan, String jabatan) {
        setNama(nama);
        setNim(nim);
        setAngkatan(angkatan);
        setJabatan(jabatan);
    }
    public void detailInfo() {
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNim());
        System.out.println("Angkatan    : " + getAngkatan());
        System.out.println("Jabatan     : " + getJabatan());
    }
}
