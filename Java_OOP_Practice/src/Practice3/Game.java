package Practice3;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    public HumanPlayer humanPlayer;
    public ComputerPlayer computerPlayer;

    public void play() {

        System.out.println("Welcome to Rock-Paper-Scissors!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String humanName = scanner.nextLine();
        System.out.print("Rock, Paper, or scissors? (r/p/s): ");
        String choice = scanner.nextLine();
        this.humanPlayer = new HumanPlayer(humanName, choice);
        this.computerPlayer = new ComputerPlayer("Computer");
    }

    public void result() {
        String computerChoice = computerPlayer.play();
        String humanChoice = humanPlayer.play();
        String computerName = computerPlayer.getName();
        String humanName = humanPlayer.getName();
        System.out.println(humanName + " choose " + humanChoice);
        System.out.println(computerName + " choose " + computerChoice);
//        Rock beats scissors
        if (computerChoice.equals("r") && humanChoice.equals("p")) {
            System.out.println(humanName + " wins");
        }
//        Scissors beats paper
        else if (computerChoice.equals("s") && humanChoice.equals("p")) {
            System.out.println(computerName + " wins");
        }
//        Paper beats rock
        else if (computerChoice.equals("p") && humanChoice.equals("r")) {
            System.out.println(computerName + " wins");
        }
//        Rock loses to paper
        else if (computerChoice.equals("r") && humanChoice.equals("p")) {
            System.out.println(humanName + " wins");
        }
//        Scissors lose to rock
        else if (computerChoice.equals("s") && humanChoice.equals("r")) {
            System.out.println(humanName + " wins");
        }
//        Paper loses to scissors
        else if (computerChoice.equals("p") && humanChoice.equals("s")) {
            System.out.println(humanName + " wins");
        }
//        Rock ties with rock
//        Scissors ties with scissors
//        Paper ties with paper

        else {
            System.out.println("Ties ");
        }

    }
}
