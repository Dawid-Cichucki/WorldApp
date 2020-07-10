package world.dto;

import java.util.List;

public class CountryAndLanguageDTO {

    private String name;
    private String continent;
    private Integer population;
    private Double lifeExpectancy;
    private List<String> countryLanguage;

    public CountryAndLanguageDTO(String name, String continent, Integer population, Double lifeExpectancy, List<String> countryLanguage) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.countryLanguage = countryLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public List<String> getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(List<String> countryLanguage) {
        this.countryLanguage = countryLanguage;
    }
}
