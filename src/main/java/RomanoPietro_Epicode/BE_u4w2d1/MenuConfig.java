package RomanoPietro_Epicode.BE_u4w2d1;

import RomanoPietro_Epicode.BE_u4w2d1.entities.Drinks;
import RomanoPietro_Epicode.BE_u4w2d1.entities.Menu;
import RomanoPietro_Epicode.BE_u4w2d1.entities.Pizza;
import RomanoPietro_Epicode.BE_u4w2d1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;


@Configuration
public class MenuConfig {

    //------------------Pizzas----------------------------

    @Bean
    public Pizza Margherita(){
        return new Pizza("Margherita", 4.99, 1104, Arrays.asList("Tomato", "Cheese"), "xxl");
    }

    @Bean
    public Pizza hawaiian(){
        return new Pizza("Hawaiian", 6.49, 1024, Arrays.asList("Tomato", "Cheese","Ham", "Pineapple"), "normal");
    }
    @Bean
    public Pizza diavola(){
        return new Pizza("Diavola", 5.99, 1160, Arrays.asList("Tomato", "Cheese", "Salame"), "normal");
    }



    //------------------Toppings----------------------------
    @Bean
    public Toppings cheese(){
        return new Toppings("Cheese", 0.69, 92);
    }
    @Bean
    public Toppings ham(){
        return new Toppings("Ham", 0.99, 35);
    }
    @Bean
    public Toppings onions(){
        return new Toppings("Onions", 0.69, 22);
    }
    @Bean
    public Toppings pineapple(){
        return new Toppings("Pineapple", 0.79, 24);
    }
    @Bean
    public Toppings Salame(){
        return new Toppings("Salame", 0.99, 86);
    }


    //------------------DRINKS----------------------------
    @Bean
    public Drinks cocaCola(){
        return new Drinks("cocaCola",2.50, 150, 0.33, 0);
    }
    @Bean
    public Drinks water(){
        return new Drinks("Water",1.00, 0, 0.33, 0);
    }
    @Bean
    public Drinks lemonade(){
        return new Drinks("Lemonade",1.00, 128, 0.33, 0);
    }
    @Bean
    public Drinks beer(){
        return new Drinks("Beer",5.00, 43, 0.66, 4.5);
    }

    @Bean
    public Drinks getBeer2(){
        return new Drinks("Beer2",5.00, 43, 0.66, 4.5);
    }

    @Bean
    public Menu menu(){
        return new Menu(

                Arrays.asList(Margherita(), hawaiian(), diavola()),
                Arrays.asList(cheese(), ham(), onions(), pineapple(), Salame()),
                Arrays.asList(cocaCola(), water(), lemonade(), beer())
        );
    }


}
