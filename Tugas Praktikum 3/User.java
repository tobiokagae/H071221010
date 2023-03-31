package Tugas03;

public class User {
    String name;
    int balance;

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    int getBalance() {
        return this.balance;
    }
    public void card() {
        System.out.println("-------------CARD------------");
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println("-----------------------------");
    }
}
