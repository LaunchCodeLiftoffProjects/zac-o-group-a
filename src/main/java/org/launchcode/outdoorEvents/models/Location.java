package org.launchcode.outdoorEvents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Location extends AbstractEntity{


    private String longitude;
    private String latitude;

    @Size(max = 500, message = "Description too long!")
    private String description;

    public Location() {
    }

    public Location(String longitude, String latitude, String description) {
        super();
        this.longitude = longitude;
        this.latitude = latitude;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongitude() {return longitude; }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
