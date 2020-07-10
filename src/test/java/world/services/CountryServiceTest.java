package world.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import world.exception.InvalidCountryCode;
import world.repositories.CountryLanguageRepository;
import world.repositories.CountryRepository;

import static org.junit.jupiter.api.Assertions.*;

class CountryServiceTest {

    CountryService countryService;

    @Mock
    CountryRepository countryRepository;
    @Mock
    CountryLanguageRepository countryLanguageRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        countryService = new CountryService(countryRepository,countryLanguageRepository);
    }

    @Test
    void getCountry() {
        assertThrows(InvalidCountryCode.class,()->{
            countryService.getCountry("ahr");
        });
    }
}