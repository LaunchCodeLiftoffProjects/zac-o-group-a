package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer>{
}
