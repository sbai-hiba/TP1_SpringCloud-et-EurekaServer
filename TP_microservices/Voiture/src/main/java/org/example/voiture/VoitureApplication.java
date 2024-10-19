package org.example.voiture;

import org.example.voiture.entities.Voiture;
import org.example.voiture.repositories.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(VoitureRepository voitureRepository) {
		return args -> {
			voitureRepository.save(new Voiture(null, "Toyota", "ABC123", "Corolla", 1L, null));
			voitureRepository.save(new Voiture(null, "Honda", "DEF456", "Civic", 2L, null));
			voitureRepository.save(new Voiture(null, "Ford", "GHI789", "Focus", 3L, null));
		};
	}

}
