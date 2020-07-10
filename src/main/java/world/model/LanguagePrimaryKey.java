package world.model;


import java.io.Serializable;
import java.util.Objects;


public class LanguagePrimaryKey implements Serializable {

    protected String language;
    protected Country countryCode;

    public LanguagePrimaryKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguagePrimaryKey that = (LanguagePrimaryKey) o;
        return language.equals(that.language) &&
                countryCode.equals(that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, countryCode);
    }
}
