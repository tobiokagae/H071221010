package Tugas02;

public class Group48 {
    String nama;
    String captain;
    int tahun;
    public void setNama(String nama) {
        this.nama = nama;
    }
    String getNama() {
        return this.nama;
    }
    public void setCaptain(String captain) {
        this.captain = captain;
    }
    String getCaptain() {
        return this.captain;
    }
    public void setTahun(int tahun) {
       this.tahun = tahun;
    }
    int getTahun() {
        return this.tahun;
    }
    public void detailGroup() {
        System.out.println("Nama Group      : " + nama);
        System.out.println("Tahun Debut     : " + tahun);
        System.out.println("Kapten Group    : " + captain);
    }
}
