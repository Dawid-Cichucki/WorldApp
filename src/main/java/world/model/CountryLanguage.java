package world.model;



import javax.persistence.*;

@Entity
@IdClass(LanguagePrimaryKey.class)
public class CountryLanguage {

    @Id
    @ManyToOne
    @JoinColumn(name = "country_code")
    private Country countryCode;

    @Id
    private String language;

    @Column(nullable = false)
    private Boolean isOfficial;

    @Column(nullable = false)
    private Double percentage;



    public CountryLanguage() {
    }

    public Country getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Country countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}
