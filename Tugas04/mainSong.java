public class mainSong {
    public static void main(String[] args) {
        Song song = new Song();
        song.setTitle("Dialog Masa SMA");
        song.setArtist("Husna, Kia, Faiz");
        song.setAlbum("Amourtala");
        song.setYear(2022);
        song.setGenre("POP");
        song.displayInfo();
        Song song2 = new Song("Rapsodi", "JKT48", "Rapsodi", 2020, "POP");
        song2.displayInfo();
        SelfUtils.displaySelfData();
    }
}
