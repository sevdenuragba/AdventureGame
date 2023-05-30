import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;


    public Player(String name){
        this.name = name;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar(){
        System.out.println("Oyuna başlamak için karakterinin seçiniz:\n" +
                "[1][Samuray]\t[Hasar: 5] [Sağlık: 21] [Para: 15]\n" +
                "[2][Okçu]\t\t[Hasar: 7] [Sağlık: 18] [Para: 20]\n" +
                "[3][Şövalye]\t[Hasar: 8] [Sağlık: 24] [Para: 5]");
    }
}
