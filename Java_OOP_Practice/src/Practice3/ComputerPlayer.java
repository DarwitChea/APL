package Practice3;

import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public String play() {
        String computerChoice = "";
        Random random = new Random();
        int randnumber = random.nextInt(3) + 1;
        if (randnumber == 1) {
            computerChoice = "r";

        } else if (randnumber == 2) {
            computerChoice = "p";

        } else {
            computerChoice = "s";
        }
        return computerChoice;
    }
}
