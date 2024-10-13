package Practice3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Scanner scanner = new Scanner(System.in);

        String playAgain = "Y";
        while(playAgain != "N"){
            game.play();
            game.result();
            System.out.print("Play Again? (Y/N): ");
            playAgain = scanner.nextLine();
        }
    }
}
