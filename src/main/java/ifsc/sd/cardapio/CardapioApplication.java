package ifsc.sd.cardapio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"ifsc.sd.cardapio.models"})
public class CardapioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardapioApplication.class, args);
	}

}
