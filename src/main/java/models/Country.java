package models;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {
	@Id
	@Column(columnDefinition = "code")
    private String code;
	
	@Column(columnDefinition = "name")
    private String name;
	
	@Column(columnDefinition = "continent")
    private String continent;
	
	@Column(columnDefinition = "region")
    private String region;
	
	@Column(columnDefinition = "surface_area")
    private Long surface_area;
	
	@Column(columnDefinition = "indep_year")
    private Integer indep_year;
	
	@Column(columnDefinition = "life_expectancy")
    private Double life_expectancy;
	
	@Column(columnDefinition = "gnp")
    private Double gnp;
	
	@Column(columnDefinition = "gnp_old")
    private Double gnp_old;
	
	@Column(columnDefinition = "local_name")
    private String local_name;
	
	@Column(columnDefinition = "government_form")
    private String government_form;
	
	@Column(columnDefinition = "head_of_state")
    private String head_of_state;
	
	@Column(columnDefinition = "capital")
    private Integer capital;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "country_code", referencedColumnName = "code")
	private List<CountryLanguage> languages;
	
	public List<CountryLanguage> getLanguage() {
		return languages;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Long getSurface_area() {
		return surface_area;
	}

	public void setSurface_area(Long surface_area) {
		this.surface_area = surface_area;
	}

	public Integer getIndep_year() {
		return indep_year;
	}

	public void setIndep_year(int indep_year) {
		this.indep_year = indep_year;
	}

	public Double getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(Double life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public Double getGnp() {
		return gnp;
	}

	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}

	public Double getGnp_old() {
		return gnp_old;
	}

	public void setGnp_old(Double gnp_old) {
		this.gnp_old = gnp_old;
	}

	public String getLocal_name() {
		return local_name;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}

	public String getGovernment_form() {
		return government_form;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public String getHead_of_state() {
		return head_of_state;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	@Column(columnDefinition = "code2")
    private String code2;
	
	
}
