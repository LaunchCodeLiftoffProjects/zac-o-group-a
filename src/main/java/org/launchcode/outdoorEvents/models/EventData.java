package org.launchcode.outdoorEvents.models;

import java.util.ArrayList;

public class EventData {


    public static ArrayList<Event> findByColumnAndValue(String column, String value, Iterable<Event> allEvents) {

        ArrayList<Event> results = new ArrayList<>();

        if (value.toLowerCase().equals("all")){
            return (ArrayList<Event>) allEvents;
        }

        if (column.equals("all")){
            results = findByValue(value, allEvents);
            return results;
        }
        for (Event event : allEvents) {

            String aValue = getFieldValue(event, column);

            if (aValue != null && aValue.toLowerCase().contains(value.toLowerCase())) {
                results.add(event);
            }
        }

        return results;
    }

    public static String getFieldValue(Event event, String fieldName){
        String theValue;
        if (fieldName.equals("name")){
            theValue = event.getName();
        } else if (fieldName.equals("Category")){
            theValue = event.getEventCategory().toString();
        } else {
            theValue = event.getDescription().toString();
        }

        return theValue;
    }


    public static ArrayList<Event> findByValue(String value, Iterable<Event> allEvents) {
        String lower_val = value.toLowerCase();

        ArrayList<Event> results = new ArrayList<>();

        for (Event event : allEvents) {

            if (event.getName().toLowerCase().contains(lower_val)) {
                results.add(event);
            } else if (event.getDescription().toLowerCase().contains(lower_val)) {
                results.add(event);
            } else if (event.getEventCategory().toString().toLowerCase().contains(lower_val)) {
                results.add(event);
            } else if (event.toString().toLowerCase().contains(lower_val)) {
                results.add(event);
            }

        }

        return results;
    }


}

