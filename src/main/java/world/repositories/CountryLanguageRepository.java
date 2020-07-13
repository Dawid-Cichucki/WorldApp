package world.repositories;

import org.springframework.data.repository.CrudRepository;
import world.model.Country;
import world.model.CountryLanguage;

import world.model.LanguagePrimaryKey;

import java.util.List;


public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, LanguagePrimaryKey> {
    List<CountryLanguage> findByCountryCode(Country country);
}
