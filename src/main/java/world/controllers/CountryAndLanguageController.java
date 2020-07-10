package world.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import world.dto.CountryAndLanguageDTO;

import world.exception.InvalidCountryCode;
import world.services.CountryService;

@RestController
public class CountryAndLanguageController {

    CountryService countryService;

    @Autowired
    public CountryAndLanguageController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path = "/{code}")
    public CountryAndLanguageDTO getCountryAnbLanguage(@PathVariable("code") String code){

        return countryService.getCountry(code);
    }
}
