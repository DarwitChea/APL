import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public HumanPlayer humanPlayer;
    public ComputerPlayer computerPlayer;

    void play(){
        System.out.println("Welcome to Rock-Paper-Scissors");
        System.out.print("Enter your name: ");
        String humanName = scanner.nextLine();
        System.out.print("Rock, paper, or scissors? (r/p/s): ");
        while(!scanner.hasNext("[rps]")){
            System.out.println("That's not an option!");
            System.out.print("Pick again! (r/p/s): ");
            scanner.next();
        }
        String humanChoice = scanner.next();

        this.humanPlayer = new HumanPlayer(humanName,humanChoice);
        this.computerPlayer = new ComputerPlayer("Bob");

    }
     void result(){
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

        else {
            System.out.println("Ties ");
        }

    }

}
