package org.launchcode.outdoorEvents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Location extends AbstractEntity{


    private String location; //TODO implement with maps API

    @Size(max = 500, message = "Description too long!")
    private String description;

    public Location(String location, String description) {
        this.location = location;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
