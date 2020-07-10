package world.repositories;

import org.springframework.data.repository.CrudRepository;
import world.model.City;

public interface CityRepository extends CrudRepository<City,Long> {
}
