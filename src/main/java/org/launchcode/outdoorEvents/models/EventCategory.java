<<<<<<< HEAD
package org.launchcode.outdoorEvents.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;


@Entity
public class EventCategory extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany(mappedBy = "type")
    private List<Event> events = new ArrayList<>();

    public EventCategory() {}

}
=======
package org.launchcode.outdoorEvents.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;


@Entity
public class EventCategory extends AbstractEntity {

    public EventCategory() {}

}
>>>>>>> 6a7d9bd0573104a4846b463685570f2a3eff0f29
