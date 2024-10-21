package RomanoPietro_Epicode.BE_u4w2d1.entities;
import lombok.*;
import java.util.List;


@Setter
@Getter
@ToString
public class Pizza extends FoodItem {
    private List<String> toppings;
    private String size;


    public Pizza(String name, double price, int calories, List<String> toppings, String size) {
        super(name, price, calories);
        this.toppings = toppings;
        this.size = size;
    }
}
