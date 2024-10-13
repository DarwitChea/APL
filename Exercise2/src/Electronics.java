public class Electronics extends Product{
    String manufacturer;

    public Electronics(String name, float price, int quantity, String manufacturer) {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "\nElectronics: " +
                "\nName: " + name +
                "\nPrice: " + price +
                "\nQuantity: " + quantity +
                "\nManufacturer: " + manufacturer;
    }
}
