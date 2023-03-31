package Tugas03;

public class Nomor01 {
    public static void main(String[] args) {

    Boboiboy boboiboy1 = new Boboiboy("Boboiboy Gletser", 5, 500);
    Boboiboy boboiboy2 = new Boboiboy("Boboiboy FrostFire", 520);
    boboiboy1.detailBoboiboy();
    boboiboy2.detailBoboiboy();
    boboiboy1.attack(boboiboy2);
    System.out.println();
    boboiboy1.detailBoboiboy();
    boboiboy2.detailBoboiboy();
    boboiboy2.menang(boboiboy1);
    }
    
}
