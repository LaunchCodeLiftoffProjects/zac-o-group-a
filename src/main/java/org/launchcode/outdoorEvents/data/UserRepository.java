package org.launchcode.outdoorEvents.data;

import org.launchcode.outdoorEvents.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByName(String name);
    User findByEmail(String email);
}
