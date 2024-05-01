import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Product> products = new ArrayList<>();
    private User user;

    public ShoppingCart() {
        this.user = null;
    }

    public ShoppingCart(User user) {
        this.user = user;
    }

    public ShoppingCart(ArrayList<Product> products, User user) {
        this.products = products;
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public void addUser(User user) {
        if (this.user == null) {
            this.user = user;
        }
    }

    public void addProduct(Product p, Category c) {
        try {
            if (c.products.isEmpty() || !c.products.contains(p)) {
                throw new ArrayStoreException();
            }
            products.add(p);
            c.removeProduct(p);
        } catch (ArrayStoreException e) {
            System.out.println("There is no such product in store");
            e.getStackTrace();
            throw new ArrayStoreException();
        }
    }

    public void removeProduct(Product p, Category c) {
        products.remove(p);
        c.addProduct(p);
    }

    public void pay() {
        double prize = 0;
        for (Product p : products) {
            prize += p.prize();
        }
        System.out.println("You need to pay: " + prize + "$");
    }
}