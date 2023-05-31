import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private String name;

    public Scanner scanner = new Scanner(System.in);


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
        int selection = 0;
        loop:
        do{
            System.out.println("""
                    Oyuna başlamak için karakterinin seçiniz:
                    [1][Samuray]\t[Hasar: 5] [Sağlık: 21] [Para: 15]
                    [2][Okçu]\t\t[Hasar: 7] [Sağlık: 18] [Para: 20]
                    [3][Şövalye]\t[Hasar: 8] [Sağlık: 24] [Para: 5]""");
            selection = scanner.nextInt();
            switch (selection) {
                case 1 :
                    chosenPlayer(new Samurai());
                    break loop;
                case 2 :
                    chosenPlayer(new Archer());
                    break loop;
                case 3 :
                    chosenPlayer(new Knight());
                    break loop;
                default :
                    System.out.println("hatalı giriş yaptınız. Tekrar deneyiniz.");
            }
        } while(true);
    }
    public void chosenPlayer(Characters c){
        this.setDamage(c.getDamage());
        this.setHealth(c.getHealth());
        this.setMoney(c.getMoney());
    }
}
