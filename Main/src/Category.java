import java.util.ArrayList;

public class Category {
    private String name;
    public ArrayList<Product> products = new ArrayList<>();

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return this.name;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public void removeProduct(Product p) {
        this.products.remove(p);
    }
}