package Tugas05;

public class Main {
    public static void main(String[] args) {
        PengurusInti ketua = new PengurusInti("Mingyu", "H071191097", 2019, "Ketua");
        PengurusInti wakil = new PengurusInti("Jisung", "H071191022", 2019, "Wakil Ketua");
        PengurusInti sekretaris = new PengurusInti("Eunha", "H071201097", 2020, "Sekretaris");
        PengurusInti bendahara = new PengurusInti("Baekhyun", "H071191092", 2019, "Bendahara");

        Koordinator mobile = new Koordinator("Wendy", "H071201094", 2020, "Koordinator Mobile Development");
        Koordinator web = new Koordinator("Xiaojun", "H071211020", 2021, "Koordinator Web Development");
        Koordinator uiux = new Koordinator("Winter", "H071221021", 2022, "Koordinator UI/UX");
        System.out.println("======= KEPENGURUSAN KOMUNITAS PROGRAMMER UNHAS =======");
        System.out.println("-------------------- Pengurus Inti --------------------");
        ketua.detailInfo();
        System.out.println();
        wakil.detailInfo();
        System.out.println();
        sekretaris.detailInfo();
        System.out.println();
        bendahara.detailInfo();
        System.out.println();
        System.out.println("--------------------- Koordinator ---------------------");
        mobile.detailInfo();;
        System.out.println();
        web.detailInfo();
        System.out.println();
        uiux.detailInfo();
        System.out.println("=======================================================");
    }
}
