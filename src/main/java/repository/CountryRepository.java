package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {

	@Query(value="SELECT country.name,country.continent,country.population,country.life_expectancy,CL.language FROM country JOIN (SELECT * FROM country_language WHERE country_code = :code ORDER BY percentage DESC LIMIT 1)CL ON CL.country_code = country.code WHERE code = :code",nativeQuery = true)
	List<Object[]> fetchCountryLanguageBasedOnCode(@Param("code") String code);
	
}
