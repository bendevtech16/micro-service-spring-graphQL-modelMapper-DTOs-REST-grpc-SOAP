package cm.uy1.custumerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cm.uy1.custumerservice.entities.Customer;
import cm.uy1.custumerservice.repository.CustomerRepository;

@SpringBootApplication
public class CustumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustumerServiceApplication.class, args);

	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder().name("benjamin").email("bohandja16@gmail.com").build());
			customerRepository.save(Customer.builder().name("francis").email("kapi10@gmail.com").build());
			customerRepository.save(Customer.builder().name("yassin").email("hacker-virus@gmail.com").build());
		};
	}

}
