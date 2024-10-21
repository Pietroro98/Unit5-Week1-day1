package RomanoPietro_Epicode.BE_u4w2d1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Drinks extends FoodItem{
    private double volume;
    private double alcoholPercentage;


    public Drinks(String name, double price, int calories, double volume, double alcoholPercentage) {
        super(name, price, calories);
        this.volume = volume;
        this.alcoholPercentage = alcoholPercentage;
    }
}
