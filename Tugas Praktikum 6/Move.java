interface Move {
    void move();
}

abstract class Dog implements Move {
    int position;
    int averageLength;
    abstract void describe();
    
    public Dog(int position, int averageLength){
        this.position = position;
        this.averageLength = averageLength;
    }
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    void describe() {
        System.out.println("ANJING PITBULL");
        System.out.println("Posisi              : " + position);
        System.out.println("Deskripsi           : Pitbull memiliki tubuh kekar dengan dada dalam dan kepala berbentuk kotak.");
        System.out.println("Panjang Rata-Rata   : " + averageLength + " cm");
    }
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
    }

    @Override
    void describe() {
        System.out.println("ANJING SIBERIAN HUSKY");
        System.out.println("Posisi              : " + position);
        System.out.println("Deskripsi           : Siberian Husky termasuk dalam jenis anjing ras berukuran sedang dan berbulu tebal.");
        System.out.println("Panjang Rata-Rata   : " + averageLength + " cm");
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    public void move() {
        position += 1;
    }

    @Override
    void describe() {
        System.out.println("ANJING BULLDOG");
        System.out.println("Posisi              : " + position);
        System.out.println("Deskripsi           : Bulldog memiliki bentuk mata bulat, hidung berwarna hitam dengan lubang hidung berukuran besar. ");
        System.out.println("Panjang Rata-Rata   : " + averageLength + " cm");
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    void describe() {
        System.out.println("GERMAN SHEPHERD");
        System.out.println("Posisi              : " + position);
        System.out.println("Deskripsi           : German Shepherd memiliki dada yang ramping dan mendalam.");
        System.out.println("Panjang Rata-Rata   : " + averageLength + " cm");
    }
}

class Smartphone implements Move {
    int price;
    String brand;
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}