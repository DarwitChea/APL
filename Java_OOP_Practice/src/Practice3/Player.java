package Practice3;

public class Player {
    public String name;
    public String choice;

    public String play() {
        return choice;
    }

    ;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

}
