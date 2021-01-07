package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ReclamationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclamationApplication.class, args);
	}
	
	@Autowired
	private ReclamationRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save			
			repository.save(new Reclamation(1,254,"Ch","ma@esprit.tn"));
			
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}

}