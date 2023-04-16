package Tugas05;
public class BangunRuang {
    int sisi;
    int panjang;
    int lebar;
    int tinggi;
    int jariJari;

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
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getJariJari() {
        return jariJari;
    }
    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
}

class Kubus extends BangunRuang {
    public Kubus(int sisi) {
        setSisi(sisi);;
    }
    double luasPermukaan() {
        return 6*Math.pow(sisi, 2);
    }
    double volume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    public Balok(int panjang, int lebar, int tinggi) {
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }
    double luasPermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(tinggi*lebar));
    }
    double volume() {
        return panjang*lebar*tinggi;
    }
}

class Bola extends BangunRuang {
    public Bola(int jariJari) {
        setJariJari(jariJari);
    }
    double luasPermukaan() {
        return 4*Math.PI*Math.pow(jariJari, 2);
    }
    double volume() {
        return (4/3)*Math.PI*Math.pow(jariJari, 3);
    }
}

class Tabung extends BangunRuang {
    public Tabung(int jariJari, int tinggi) {
        setJariJari(jariJari);
        setTinggi(tinggi);
    }
    double luasPermukaan() {
        return (2*Math.PI*jariJari*tinggi) + (2*Math.PI*Math.pow(jariJari, 2));
    }
    double volume() {
        return Math.PI*Math.pow(jariJari, 2)*tinggi;
    }
}

