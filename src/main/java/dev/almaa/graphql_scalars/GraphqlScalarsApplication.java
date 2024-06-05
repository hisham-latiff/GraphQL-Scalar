package dev.almaa.graphql_scalars;

import dev.almaa.graphql_scalars.model.Product;
import dev.almaa.graphql_scalars.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class GraphqlScalarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlScalarsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository repository) {
		return args -> {
			List<Product> products = List.of(
					new Product("Product 1",true,1.99F, new BigDecimal(9.99),LocalDateTime.now()),
					new Product("Product 2",false,3.99F,new BigDecimal(9.99),LocalDateTime.now()),
					new Product("Product 3", true, 19.99F,new BigDecimal(9.99),LocalDateTime.now())
			);


			repository.saveAll(products);

			repository.findAll().forEach(System.out::println);


		};
	}

}
