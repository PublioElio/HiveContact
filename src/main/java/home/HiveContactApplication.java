package home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main entry point for the HiveContact Spring Boot application.
 * 
 * This class initializes the Spring Boot application and configures package
 * scanning for components, entities, and repositories.
 * 
 * @author AdrianoDíazBenítez
 */
@SpringBootApplication // Marks this class as a Spring Boot application
@ComponentScan(basePackages = { "controller", "dao", "service" }) // Scans for components in these packages
@EntityScan(basePackages = { "model" }) // Scans for JPA entity classes
@EnableJpaRepositories(basePackages = { "dao" }) // Enables JPA repositories in the "dao" package
public class HiveContactApplication {

	/**
	 * Main method to run the Spring Boot application.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(HiveContactApplication.class, args);
	}
}
