package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
