package controllers;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

import models.City;
import models.Country;
import models.CountryLanguage;
import repository.CityRepository;
import repository.CountryLanguageRepository;
import repository.CountryRepository;
import returnables.Error;

@RestController
public class TaskController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
    private CityRepository cityRepository;
	
	@Autowired
    private CountryRepository countryRepository;
	
	@Autowired
    private CountryLanguageRepository countryLanguageRepository;
	
//	@GetMapping("/cities")
//	public Page<City> fetchCities(Pageable pageable) {
//		return cityRepository.findAll(pageable);
//	}
//	
//	@GetMapping("/countries")
//	public Page<Country> fetchCountries(Pageable pageable) {
//		return countryRepository.findAll(pageable);
//	}
//	
//	@GetMapping("/languages")
//	public Page<CountryLanguage> fetchLanguages(Pageable pageable) {
//		return countryLanguageRepository.findAll(pageable);
//	}
	
	@GetMapping("/{code}")
	public Object fetchCountry(@PathVariable("code") String code) {
		List<Object[]> obj = countryRepository.fetchCountryLanguageBasedOnCode(code);
		if(obj.size() > 0) {
			returnables.Country country = new returnables.Country();
			country.setName(String.valueOf(obj.get(0)[0]));
			country.setContinent(String.valueOf(obj.get(0)[1]));
			country.setPopulation(Long.parseLong(String.valueOf(obj.get(0)[2])));
			country.setLife_expectancy(Double.valueOf(String.valueOf(obj.get(0)[3])));
			country.setCountry_language(String.valueOf(obj.get(0)[4]));
			return country;
		}else {
			return new Error("INVALID_COUNTRY_CODE");
		}
	}
}
