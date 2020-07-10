package world.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.dto.CountryAndLanguageDTO;
import world.exception.InvalidCountryCode;
import world.model.Country;
import world.model.CountryLanguage;
import world.repositories.CountryLanguageRepository;

import world.repositories.CountryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    CountryRepository countryRepository;
    CountryLanguageRepository countryLanguageRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository, CountryLanguageRepository countryLanguageRepository) {
        this.countryRepository = countryRepository;
        this.countryLanguageRepository = countryLanguageRepository;
    }

    public CountryAndLanguageDTO getCountry(String code){

        Optional<Country> countryOptional = countryRepository.findById(code);
        if (!countryOptional.isPresent()) {
            throw new InvalidCountryCode();
        }
        Country country = countryOptional.get();

        List<String> countryLanguageList = new ArrayList<>();
        for (CountryLanguage countryLanguage : countryLanguageRepository.findAll()) {
            if (countryLanguage.getCountryCode().getCode().equals(code)) {
                System.out.println(countryLanguage.getCountryCode());
                countryLanguageList.add(countryLanguage.getLanguage());
            }
        }

        CountryAndLanguageDTO countryAndLanguageDTO = new CountryAndLanguageDTO(
                country.getName(),
                country.getContinent(),
                country.getPopulation(),
                country.getLifeExpectancy(),
                countryLanguageList
        );

        return countryAndLanguageDTO;
    }

}
