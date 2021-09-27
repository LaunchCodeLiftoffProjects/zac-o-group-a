package org.launchcode.outdoorEvents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class EventCategory extends AbstractEntity {


    @Size(min=3, message="Name must be at least 3 characters long")
    private String title;

    public EventCategory(@Size(min = 3, message = "Name must be at least 3 characters long") String title) {
        this.title = title;
    }

    public EventCategory() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

