

import java.util.ArrayList;
import java.util.List;





public class VendingMachine {
    
    private List<Product> products;

    public VendingMachine() {
        this.products = new ArrayList<>();

    }

    public VendingMachine(List<Product> products) {
        this.products = products;

    }


    public void addProducts (List<Product> products) {
        this.products.addAll(products);

    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public Product getProduct(String name, float volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                if(((HotDrink)product).getVolume() == volume && ((HotDrink)product).getTemperature() == temperature && product.getName() == name) {
                    Product result = product;
                    products.remove(product);
                    return result;
                }
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }

}
