public class Car extends Vehicle{

    int numSeats;
    public Car(String make, String model, int year, double price, int numSeats) {
        super(make, model, year, price);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    @Override
    public String toString() {
        return "Car:" +
                "\nNumber of seats = " + numSeats +
                "\nIt was made in " + make +
                "\nThe model is " + model +
                "\nIt was made in " + year +
                "\nThe price is " + price
                ;
    }
}
