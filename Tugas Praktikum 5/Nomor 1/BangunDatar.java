package Tugas05;
public class BangunDatar {
    int alas;
    int tinggi;
    int sisi1;
    int sisi2;
    int sisi;
    int panjang;
    int lebar;
    int jariJari;
    int sisiAtas;
    int sisiBawah;
    int sisiKanan;
    int sisiKiri;

    public int getAlas() {
        return alas;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getSisi1() {
        return sisi1;
    }
    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }
    public int getSisi2() {
        return sisi2;
    }
    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }
    public int getSisi() {
        return sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    public int getJariJari() {
        return jariJari;
    }
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
    public int getSisiAtas() {
        return sisiAtas;
    }
    public void setSisiAtas(int sisiAtas) {
        this.sisiAtas = sisiAtas;
    }
    public int getSisiBawah() {
        return sisiBawah;
    }
    public void setSisiBawah(int sisiBawah) {
        this.sisiBawah = sisiBawah;
    }
    public int getSisiKanan() {
        return sisiKanan;
    }
    public void setSisiKanan(int sisiKanan) {
        this.sisiKanan = sisiKanan;
    }
    public int getSisiKiri() {
        return sisiKiri;
    }
    public void setSisiKiri(int sisiKiri) {
        this.sisiKiri = sisiKiri;
    }
}

class Persegi extends BangunDatar {
    public Persegi(int sisi) {
        setSisi(sisi);
    }
    double luas() {
        return Math.pow(sisi, 2);
    }
    double keliling() {
        return sisi*4;
    }
}

class persegiPanjang extends BangunDatar {
    public persegiPanjang(int panjang, int lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }
    double luas() {
        return panjang*lebar;
    }
    double keliling() {
        return (panjang*2)+(lebar*2);
    }
}

class Lingkaran extends BangunDatar {
    public Lingkaran(int jariJari) {
        setJariJari(jariJari);
    }
    double luas() {
        return Math.PI*Math.pow(jariJari, 2);
    }
    double keliling() {
        return Math.PI*2*jariJari;
    }
}

class Segitiga extends BangunDatar {
    public Segitiga(int alas, int tinggi, int sisi1, int sisi2) {
        setAlas(alas);
        setTinggi(tinggi);
        setSisi1(sisi1);
        setSisi2(sisi2);
    }
    double luas() {
        return 0.5*alas*tinggi;
    }
    double keliling() {
        return sisi1+sisi2+alas;
    }
}

class Trapesium extends BangunDatar {
    public Trapesium(int sisiAtas, int sisiBawah, int sisiKanan, int sisiKiri, int tinggi) {
        setSisiAtas(sisiAtas);
        setSisiBawah(sisiBawah);
        setSisiKanan(sisiKanan);
        setSisiKiri(sisiKiri);
        setTinggi(tinggi);
    }
    double luas() {
        return (1/2)*sisiAtas*sisiBawah*tinggi;
    }
    double keliling() {
        return sisiAtas+sisiBawah+sisiKanan+sisiKiri;
    }
}
