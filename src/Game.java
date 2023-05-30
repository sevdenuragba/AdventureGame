import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;

    public Scanner scanner = new Scanner(System.in);
     public void start(){

         System.out.println("Macera Oyunu!\nKarakterinizin ismini giriniz:");
         Player player = new Player(scanner.nextLine());
         player.selectChar();
         System.out.println(player.getName()+ " adaya hoş geldin!");
    }
}
