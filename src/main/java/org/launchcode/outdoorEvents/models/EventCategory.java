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
