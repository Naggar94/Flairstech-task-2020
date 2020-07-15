package models;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
	@Id
    private Long id;
	
	@Column(columnDefinition = "name")
    private String name;
	
	@Column(columnDefinition = "country_code")
    private String country_code;
	
	@Column(columnDefinition = "district")
    private String district;
	
	@Column(columnDefinition = "population")
    private Long population;
	
	public String getDistrict() {
		return district;
	}
	
	public String getName() {
		return name;
	}
	
	public Long getPopulation() {
		return population;
	}
	
	public Long getId() {
		return id;
	}
}
