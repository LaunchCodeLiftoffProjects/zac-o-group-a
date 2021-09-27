package org.launchcode.outdoorEvents.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Event extends AbstractEntity {

    @ManyToOne
    //@JoinColumn(name="user_id")
    private User user;

    @NotBlank(message = "Description is required")
    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Type is required")
    @ManyToMany
    private List<EventCategory> type = new ArrayList<>();

    public Event(String description, List<EventCategory> type) {
        super();
        this.description = description;
        this.type = type;
    }

    public Event() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {this.description = description;}

    public Iterable<EventCategory> getType() {return type;}

    public void setType(List<EventCategory> type) {this.type = type;}


}

