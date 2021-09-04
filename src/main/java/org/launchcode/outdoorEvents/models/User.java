package org.launchcode.outdoorEvents.models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class User extends AbstractEntity{

    @NotBlank(message = "Please enter a username")
    @Size(min = 6, max = 127)
    private String username;
    @NotBlank(message = "Please enter a password")
    @Size(min = 6, max = 127)
    private String password;

    @OneToMany
    private List<Event> events;

    @OneToMany
    private List<Location> locations;

    public User(String username, String password, List<Event> events, List<Location> locations) {
        this.username = username;
        this.password = password;
        this.events = events;
        this.locations = locations;
    }

    public String getPassword() { //TODO Figure out how to hash
        return password;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getUsername() {return username; }


}
