package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {
}
