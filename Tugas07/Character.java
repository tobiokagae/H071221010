public abstract class Character {
    String name;
    int attackPower;
    abstract int attack();
    abstract int attack(String attackType);
    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
    public String getName() {
        return name;
    }
    public int getAttackPower() {
        return attackPower;
    }
}

class Fighter extends Character {
    public Fighter(String name, int attackPower) {
        super(name, attackPower);
    }

    int attack() {
        return attackPower;
    }

    int attack(String attackType) {
        if (attackType.toLowerCase().equals("melee")) {
            return 2*attackPower;
        } else if (attackType.toLowerCase().equals("ranged")) {
            return attackPower;
        } else {
            throw new IllegalArgumentException("INVALID");
        }
    }
}

class Mage extends Character {
    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    int attack() {
        return attackPower;
    }

    int attack(String attackType) {
        if (attackType.toLowerCase().equals("frost")) {
            return 2*attackPower;
        } else if (attackType.toLowerCase().equals("fire")) {
            return 3*attackPower;
        } else {
            throw new IllegalArgumentException("INVALID"); 
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("jiang", 100);
        characters[0].attackPower = characters[0].attack("RANGED");
        characters[1] = new Mage("lili", 100);
        characters[1].attackPower = characters[1].attack("frost");
        characters[2] = new Fighter("wawa", 100);
        characters[2].attackPower = characters[2].attack("melee");
        characters[3] = new Fighter("puter", 100);
        characters[3].attackPower = characters[3].attack("ranged");
        characters[4] = new Mage("kimus", 100);
        characters[4].attackPower = characters[4].attack("fire");

        for (Character character : characters) {
            System.out.println("\nAttack> ");
            printAttack(character);
        }
    }
    static void printAttack(Character character) {
        System.out.printf("%s Attacks With %d Power.\n", character.getName(), character.attack());
    }
}