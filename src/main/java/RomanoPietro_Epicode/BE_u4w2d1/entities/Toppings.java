package RomanoPietro_Epicode.BE_u4w2d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Toppings {
    private String name;
    private double price;
    private int calories;
}

