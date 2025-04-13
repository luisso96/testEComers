package luis.almendros.ecomers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EcomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomersApplication.class, args);
	}

}
