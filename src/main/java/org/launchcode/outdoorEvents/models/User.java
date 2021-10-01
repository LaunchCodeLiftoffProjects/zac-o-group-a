<<<<<<< HEAD
package org.launchcode.outdoorEvents.models;

import com.sun.istack.NotNull;
import org.launchcode.outdoorEvents.data.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class User extends AbstractEntity{

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    protected String name;
    @NotNull
    private String pwHash;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;


    @OneToMany
    @JoinColumn(name="user_id")
    private List<Event> events = new ArrayList<>();

    @OneToMany
    @JoinColumn(name="location_id")
    private List<Location> locations = new ArrayList<>();

    public User(){};

    public User(String name, String password, String firstName, String lastName, String email) {
        this.name = name;
        this.pwHash = encoder.encode(password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public Iterable<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Location> getLocations() {return locations;}

    public void setLocations(List<Location> locations) {this.locations = locations;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public boolean isMatchingPassword(String password) {return encoder.matches(password, pwHash);}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

=======
package org.launchcode.outdoorEvents.models;

import com.sun.istack.NotNull;
import org.launchcode.outdoorEvents.data.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


@Entity
public class User extends AbstractEntity{

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @NotNull
    protected String name;
    @NotNull
    private String pwHash;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;


    @ManyToOne
    //@JoinColumn(name="user_id")
    private Event event;

    // @OneToMany
    // @JoinColumn(name="location_id")
    // private List<Location> locations = new ArrayList<>();

    public User(){};

    public User(String name, String password, String firstName, String lastName, String email) {
        this.name = name;
        this.pwHash = encoder.encode(password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public Event getEvent() {return event;}

    public void setEvent(Event event) {this.event = event;}

    // public List<Location> getLocations() {return locations;}

    // public void setLocations(List<Location> locations) {this.locations = locations;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public boolean isMatchingPassword(String password) {return encoder.matches(password, pwHash);}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

>>>>>>> 6a7d9bd0573104a4846b463685570f2a3eff0f29
