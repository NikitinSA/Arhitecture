import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity) {
        Product product = new Product(name, price, quantity);
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
