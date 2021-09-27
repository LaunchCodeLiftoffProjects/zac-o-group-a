package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.Event;
import org.launchcode.outdoorEvents.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface EventRepository extends CrudRepository<Event, Integer> {
}
