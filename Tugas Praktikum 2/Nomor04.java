package Tugas02;

class Cuboid {
    double height;
    double widht;
    double length;
    double getVolume() {
        return height*widht*length;
    }
} 
public class Nomor04 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 16.5;
        cuboid.widht = 16.5;
        cuboid.length = 16.5;
        System.out.printf("Volume   = %.2f", cuboid.getVolume());
    }
}
