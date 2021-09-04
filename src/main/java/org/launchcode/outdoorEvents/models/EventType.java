package org.launchcode.outdoorEvents.models;


import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


public enum EventType {

    HIKE("Hike"),
    FISHING("Fishing"),
    BIKERIDING("Bike Riding"),
    PICNIC("Picnic");

    private final String displayName;

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
