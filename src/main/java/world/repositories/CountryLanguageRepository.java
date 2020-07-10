package world.repositories;

import org.springframework.data.repository.CrudRepository;
import world.model.CountryLanguage;

import world.model.LanguagePrimaryKey;


public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, LanguagePrimaryKey> {
}
