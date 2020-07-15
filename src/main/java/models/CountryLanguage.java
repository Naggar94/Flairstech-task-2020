package models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "country_language")
public class CountryLanguage {
//	@Embeddable
//	static class CountryLanguagePK implements Serializable{
//		@Column(name = "country_code")
//	    private String country_code;
//		
//		@Column(name = "language")
//	    private String language;
//
//		public String getCountry_code() {
//			return country_code;
//		}
//
//		public void setCountry_code(String country_code) {
//			this.country_code = country_code;
//		}
//
//		public String getLanguage() {
//			return language;
//		}
//
//		public void setLanguage(String language) {
//			this.language = language;
//		}
//		
//		
//	}
	
//	@EmbeddedId
//    private CountryLanguagePK id;
	
	@Id
	@Column(name = "country_code")
    private String country_code;
	
	@Column(name = "language")
    private String language;

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Column(name = "is_official")
    private String is_official;
	
	@Column(name = "percentage")
    private Double percentage;

//	public CountryLanguagePK getId() {
//		return id;
//	}
//
//	public void setId(CountryLanguagePK id) {
//		this.id = id;
//	}

	public String getIs_official() {
		return is_official;
	}

	public void setIs_official(String is_official) {
		this.is_official = is_official;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
}
