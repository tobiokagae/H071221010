package Tugas02;

public class Person {
    String name;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    boolean getGender() {
        return this.isMale;
    }

    public void person() {
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("isMale  : " + getGender());
    }
}