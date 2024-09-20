package com.example.world.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.world.document.Country;

public interface CountryRepository extends MongoRepository<Country, String>{
	List<Country> findAllByContinent(PageRequest page,String continent);
	List<Country> findAllByIndependenceYearBetween(int beginYear,int endYear);
	List<Country> findAllByIndependenceYearBetweenAndContinent(int beginYear,int endYear,String continent);
	@Query("{continent: ?0}")
	List<Country> kitayaGoreGetir(String continent);
	@Query("{indepYear: {$gte: ?0, $lte: ?1}}")
	List<Country> kurulusYilinaGoreGetir(int beginYear,int endYear);
	
	
}
