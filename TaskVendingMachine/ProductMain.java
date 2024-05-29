
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class ProductMain {
    public static void main(String[] args) {

        Product hotDrink1 = new HotDrink("Coffe1", 125, LocalDate.now(), 87, 0.5F);
        Product hotDrink2 = new HotDrink("Coffe2", 300, LocalDate.now(), 60, 0.3F);


        VendingMachine htvm = new HotDrinksVendingMachine();

        htvm.addProducts(List.of(hotDrink1, hotDrink1, hotDrink1, hotDrink2, hotDrink2, hotDrink2));
        System.out.println(htvm.getProducts());
        htvm.getProduct("Coffe1", 0.5F, 87);
        System.out.println(htvm.getProducts());

    }
}
