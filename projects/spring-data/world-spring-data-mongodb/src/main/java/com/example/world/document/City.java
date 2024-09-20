package com.example.world.document;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Field;

public class City {
	@Field("_id")
	private int id;
	private String district;
	private String name;
	private int population;

	public City() {
	}

	public City(int id, String district, String name, int population) {
		this.id = id;
		this.district = district;
		this.name = name;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", district=" + district + ", name=" + name + ", population=" + population + "]";
	}

}
