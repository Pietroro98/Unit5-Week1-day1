package RomanoPietro_Epicode.BE_u4w2d1.entities;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class FoodItem {

    protected String name;
    protected double price;
    protected int calories;

}
