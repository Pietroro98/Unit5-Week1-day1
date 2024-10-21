package RomanoPietro_Epicode.BE_u4w2d1;


import RomanoPietro_Epicode.BE_u4w2d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeU4w2d1Application {

	public static void main(String[] args) {
		SpringApplication.run(BeU4w2d1Application.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeU4w2d1Application.class);

		Menu menu = context.getBean(Menu.class);
		System.out.println(menu);

		context.close();
	}

}
