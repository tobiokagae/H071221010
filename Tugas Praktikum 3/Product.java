package Tugas03;

public class Product {
    String name;
    int price,
        stock;
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String price, int stock) {
        this.name = name;
        price = price.replace("K", "000");
        Integer pricee = Integer.parseInt(price);
        this.price = pricee;
        this.stock = stock;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    int getPrice() {
        return this.price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    int getStock() {
        return this.stock;
    }
    
    int jualProduk() {
        return this.stock -= 1;
    }
}
