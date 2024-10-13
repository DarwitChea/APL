import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<Product>();

    void addProduct(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}
