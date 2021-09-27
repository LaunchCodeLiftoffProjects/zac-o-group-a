package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Integer> {
}
