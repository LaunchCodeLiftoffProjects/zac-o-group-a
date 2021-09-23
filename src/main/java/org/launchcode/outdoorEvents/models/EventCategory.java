package org.launchcode.outdoorEvents.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class EventCategory extends AbstractEntity {

    @ManyToMany(mappedBy = "type")
    private List<Event> events = new ArrayList<>();

    public EventCategory() {}

}
