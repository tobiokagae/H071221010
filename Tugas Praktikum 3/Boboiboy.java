package Tugas03;

public class Boboiboy {
    //attribute
    String nama,
           status;
    int nyawa,
        health;
    
    public Boboiboy(String nama, int nyawa, int health) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.health = health;
    }
    public Boboiboy(String nama, int health) {
        this.nama = nama;
        this.nyawa = 5;
        this.health = health;
    }
    public void setHealth(Boboiboy enemy) {
        if (this.health > 500) {
            this.health = this.health % 500;
            this.nyawa += 1;
        }

        if (enemy.health > 500) {
            enemy.health = enemy.health % 500;
            enemy.nyawa += 1;
        }
    }

    public void attack(Boboiboy enemy) {
        if (enemy.health - this.health > 0) {
            enemy.health += this.health;
            if (enemy.health > 500) {
                enemy.health = enemy.health % 500;
                enemy.nyawa += 1;
            }
            this.nyawa -= 1;
            this.health = 500;
        } else if (enemy.health - this.health == 0) {
            this.nyawa += 0;
            enemy.nyawa += 0;
        } else {
            this.health += enemy.health;
            if (this.health > 500) {
                this.health = this.health % 500;
                this.nyawa += 1;
            }
            enemy.nyawa -= 1;
            enemy.health = 500;
        }
        System.out.println(enemy.nama +" menyerang " + this.nama + ".....");
    }
    public void menang(Boboiboy enemy) {
        if (enemy.nyawa == 0) {
            System.out.println("----------- " + this.nama + " MENANG!!! -----------");
        } else if (this.nyawa == 0) {
            System.out.println("----------- " + enemy.nama + " MENANG!!! -----------");
        } else {
            System.out.println("----------- Belum ada Pemenang -----------");
        }
    }
    public void detailBoboiboy() {
        System.out.println(this.nama);
        if (this.health > 500) {
            this.health = this.health % 500;
            this.nyawa += 1;
        }
        System.out.println("Sisa nyawa : " + this.nyawa);
        if (this.nyawa <= 0) {
            status = "Mati";
        } else {
            status = "Hidup";
        }
        System.out.println("Health     : " + this.health);
        System.out.println("Status     : " + status);
        System.out.println();
    }
}


