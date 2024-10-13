public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Milk",2,1);
        System.out.println(product1.toString());

        Electronics electronic1 = new Electronics("Galaxy 10",500,1,"Samsung");
        System.out.println(electronic1.toString());

        Book book1 = new Book(1.5F,2);
        System.out.println("The cost of shipping is " + book1.calculateShipping());

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(electronic1);
        System.out.println(shoppingCart.getProducts());
    }
}