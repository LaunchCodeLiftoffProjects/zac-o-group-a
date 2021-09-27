package org.launchcode.outdoorEvents.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User{

    @Id
    @GeneratedValue
    private Integer userID;

    @Column(nullable = false, unique = true, length = 45)
    private String email;
    @Column(nullable = false, length = 20)
    private String password;
    @Column(nullable = false, length = 25)
    private String firstName;
    @Column(nullable = false, length = 25)
    private String lastName;


//    @OneToMany
//    private List<Event> events;
//
//    @OneToMany
//    private List<Location> locations;

    public User(){};


    public User(Integer userIDid, String email,String firstName, String lastName, String password/*List<Event> events,
                List<Location> locations*/) {
        this.userID = userIDid;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
//        this.events = events;
//        this.locations = locations;
    }

    public String getPassword() { //TODO Figure out how to hash
        return password;
    }

    public void setPassword(String password) { this.password = password;}

//    public List<Event> getEvents() {
//        return events;
//    }
//
//    public void setEvents(List<Event> events) {
//        this.events = events;
//    }

    public String getEmail() {return email; }

    public void setEmail(String email) { this.email = email;}

    public int getId() {return userID;}

    public void setId(int id) {this.userID = userID;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

//    public List<Location> getLocations() {return locations;}
//
//    public void setLocations(List<Location> locations) {this.locations = locations;}
}

