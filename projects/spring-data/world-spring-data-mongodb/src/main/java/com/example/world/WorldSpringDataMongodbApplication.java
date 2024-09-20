package com.example.world;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

import com.example.world.repository.CountryRepository;

@SpringBootApplication
public class WorldSpringDataMongodbApplication implements ApplicationRunner{
	private final CountryRepository countryRepository;
	
	public WorldSpringDataMongodbApplication(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WorldSpringDataMongodbApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		countryRepository.findAllByIndependenceYearBetweenAndContinent(1920,1930,"Asia")
		                 .forEach(System.out::println);
		countryRepository.findAllByContinent(PageRequest.of(2, 5), "Asia")
		                 .forEach(System.out::println);
	}

}
