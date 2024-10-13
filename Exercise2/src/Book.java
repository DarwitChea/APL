public class Book implements Shipping{

    float weight;
    float pricePerPound;

    public Book(float weight, float pricePerPound) {
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(float pricePerPound) {
        this.pricePerPound = pricePerPound;
    }

    @Override
    public float calculateShipping() {
        float shippingCost = pricePerPound * weight;
        return shippingCost;
    }
}
