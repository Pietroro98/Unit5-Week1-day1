package RomanoPietro_Epicode.BE_u4w2d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Toppings> toppings;
    private List<Drinks> drinks;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Menu:\n");

        sb.append("Pizzas:\n");
        for (Pizza pizza : pizzas) {
            sb.append("- ").append(pizza).append("\n");
        }

        sb.append("Toppings:\n");
        for (Toppings topping : toppings) {
            sb.append("- ").append(topping).append("\n");
        }

        sb.append("Drinks:\n");
        for (Drinks drink : drinks) {
            sb.append("- ").append(drink).append("\n");
        }

        return sb.toString();
    }
}
