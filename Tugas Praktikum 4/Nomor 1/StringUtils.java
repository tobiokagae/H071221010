package Tugas04no1;

public class StringUtils {
    public static String getNickname(String fullName) {
        String[] names = fullName.split(" "); // digunakan untuk memecah sebuah string menjadi beberapa bagian dengan menggunakan karakter spasi 
        if (names.length == 1) {   //method akan mengembalikan nilai parameter fullName itu sendiri sebagai nickname.
            return fullName;
        } else {
            return names[1]; //method akan mengembalikan nilai elemen ke-2 (indeks ke-1) sebagai nickname.
        }
    }
}
