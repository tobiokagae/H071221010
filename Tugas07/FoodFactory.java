import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

class Burger implements Food {
    int price = 27_000;
    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    int price = 89_000;
    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    int price = 48_000;
    @Override
    public int getPrice() {
        return price;
    }
}

public class FoodFactory {
    public static Food getFood(String menu) {
        switch (menu.toLowerCase()) {
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            case "steak":
                return new Steak();
            default:
                throw new IllegalArgumentException("Tidak Terdapat Dalam Menu");
        }
    }
}

class Restaurant {
    static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

class Main3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);
        System.out.println("\nTotal Price : " + total);
    }
}
