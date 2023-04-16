public class Song {
    String title,
           artist,
           album,
           genre;
    int year;
    public Song() {}
    public Song(String title, String artist, String album, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("DESKRIPSI LAGU");
        System.out.println("Title       : " + getTitle());
        System.out.println("Artist      : " + getArtist());
        System.out.println("Album       : " + getAlbum());
        System.out.println("Tahun Rilis : " + getYear());
        System.out.println();
    }
}
