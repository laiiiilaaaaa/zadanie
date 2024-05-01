import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Apple", 22.90);
        Product product2 = new Product("Apple pie", 34.50);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        Category category1 = new Category();
        Category category2 = new Category("Apple things");
        Category category3 = new Category("Apple", products);

        category1.addProduct(new Product("Orange juice", 14.35));
        category2.addProduct(new Product("Apple juice", 45.34));
        category3.addProduct(new Product("Lemon juice", 67.95));

        category3.removeProduct(product1);

        System.out.println(category3.getName());

        System.out.println(category1.products);
        System.out.println(category2.products);
        System.out.println(category3.products);

        User user = new User("Adam", "Black", "098765432112");

        ShoppingCart shoppingCart1 = new ShoppingCart();
        ShoppingCart shoppingCart2 = new ShoppingCart(new User("Annabel", "Smith", "123456789012"));
        ShoppingCart shoppingCart3 = new ShoppingCart(products, user);

        shoppingCart1.addUser(user);
        shoppingCart2.addProduct(category2.products.getFirst(), category2);
        shoppingCart2.addProduct(category3.products.getLast(), category3);
        //shoppingCart3.addProduct(product1, category1);
        shoppingCart3.addProduct(product2, category3);
        shoppingCart2.removeProduct(shoppingCart2.products.getLast(), category1);

        System.out.println(shoppingCart2.getUser());

        shoppingCart1.pay();
        shoppingCart2.pay();
        shoppingCart3.pay();
    }
}