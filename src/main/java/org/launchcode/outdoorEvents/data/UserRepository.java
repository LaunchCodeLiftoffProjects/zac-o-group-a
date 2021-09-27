package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
