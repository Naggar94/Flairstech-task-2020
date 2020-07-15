package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.CountryLanguage;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage,Long> {

}
