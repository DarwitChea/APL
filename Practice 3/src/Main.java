import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game1 = new Game();

        Scanner scanner = new Scanner(System.in);

        String playAgain = "Y";
        while(playAgain != "N"){
            game1.play();
            game1.result();
            System.out.print("Play Again? (Y/N): ");
            while(!scanner.hasNext("[yn]")){
                System.out.print("That's not an option!");
                System.out.print("\nPick again! (Y/N): ");
                scanner.next();
            }
            playAgain = scanner.nextLine();

        }
    }
}