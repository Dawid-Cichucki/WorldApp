package world.repositories;

import org.springframework.data.repository.CrudRepository;
import world.model.Country;

public interface CountryRepository extends CrudRepository<Country, String> {
}
