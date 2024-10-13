public abstract class Player {
    String name;
    String choice;

    public Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public Player(String name) {
        this.name = name;
    }
    public String play() {
        return choice;
    }
     String getName() { return name;}
}
