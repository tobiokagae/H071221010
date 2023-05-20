import java.util.Date;
import java.text.SimpleDateFormat;

public class Product<P> {
    String name;
    P price;
    Date expiryDate;

    public Product(String name, P price, Date expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public P getPrice() {
        return price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
}

class Main2 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Product<Integer> product1 = new Product<Integer>("Japota Honey Butter", 10_000, new Date(123, 8, 10));
        Product<String> product2 = new Product<String>("Garnier Micellar Water", "Rp. 47.000", new Date(125, 8, 01));
        Product<Double> product3 = new Product<Double>("Indofood Sambal Extra Pedas", 13.2, new Date(123, 10, 21));

        System.out.println("\nProduct 1 : " + product1.getName() + " - " + product1.getPrice() + " - " + dateFormat.format(product1.getExpiryDate()));
        System.out.println("\nProduct 2 : " + product2.getName() + " - " + product2.getPrice() + " - " + dateFormat.format(product2.getExpiryDate()));
        System.out.println("\nProduct 3 : " + product3.getName() + " - " + product3.getPrice() + " - " + dateFormat.format(product3.getExpiryDate()));
    }
}
