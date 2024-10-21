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


        sb.append(String.format("%-20s %-20s %-10s\n", "Pizzas", "Calories", "Price"));


        for (Pizza pizza : pizzas) {
            sb.append(String.format("%-20s %-20s %-10s\n",
                    pizza.getName(),
                    pizza.getCalories(),
                    pizza.getPrice()
            ));
        }

        sb.append("\n");


        sb.append(String.format("%-20s %-20s %-10s\n", "Toppings", "Calories", "Price"));


        for (Toppings topping : toppings) {
            sb.append(String.format("%-20s %-20s %-10s\n",
                    topping.getName(),
                    topping.getCalories(),
                    topping.getPrice()
            ));
        }

        sb.append("\n");

        sb.append(String.format("%-20s %-20s %-10s\n", "Drinks", "Calories", "Price"));
        for (Drinks drink : drinks) {
            String alcoholPercentage = String.format("%.1f%%", drink.getAlcoholPercentage());
            if (drink.getAlcoholPercentage() == 0) {
                alcoholPercentage = "0%";
            }

            sb.append(String.format("%-20s %-20s %-10s\n",
                    drink.getName() + String.format(" (%.2fL, %s)", drink.getVolume(), alcoholPercentage), // Nome con volume e percentuale di alcool
                    drink.getCalories(),
                    drink.getPrice()
            ));
        }

        return sb.toString();
    }
}
