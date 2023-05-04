public class MainMove {
    public static void main(String[] args) {
        Dog siberianHusky = new SiberianHusky(10, 76);

        Smartphone smartphone = new Smartphone(21_999_000, "Samsung");
        Car car = new Car(8, "Red", 340);

        siberianHusky.move();
        siberianHusky.describe();
        System.out.println();

        System.out.println("S23 ULTRA");
        System.out.println("Price              : " + smartphone.price);
        System.out.println("Brand              : " + smartphone.brand);
        smartphone.move();
        System.out.println();
        
        System.out.println("FERRARI F12");
        System.out.println("Total Forward Gear : " + car.totalForwardGear);
        System.out.println("Color              : " + car.color);
        System.out.println("Max Speed          : " + car.maxSpeed + " km/h");
        car.move();
    }    
}
