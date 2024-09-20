package com.example.world.document;

import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "countries")
public class Country {
	@Id
	private String code;
	private String name;
	private double surfaceArea;
	private int capital;
	private int population;
	@Field(name = "indepYear")
	private int independenceYear;
	private String continent;
	private String governmentForm;
	private String headOfState;
	private double lifeExpectancy;
	private String localName;
	private String region;
	private List<City> cities;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getIndependenceYear() {
		return independenceYear;
	}

	public void setIndependenceYear(int independenceYear) {
		this.independenceYear = independenceYear;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", surfaceArea=" + surfaceArea + ", capital=" + capital
				+ ", population=" + population + ", independenceYear=" + independenceYear + ", continent=" + continent
				+ ", governmentForm=" + governmentForm + ", headOfState=" + headOfState + ", lifeExpectancy="
				+ lifeExpectancy + ", localName=" + localName + ", region=" + region + ", cities=" + cities + "]";
	}

}
