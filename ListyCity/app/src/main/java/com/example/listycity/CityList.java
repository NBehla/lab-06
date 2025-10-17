package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 */
public class CityList {

    /** A list to hold City objects */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a City to the list if it does not already exist.
     *
     * @param city the candidate City to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list");
        }
        cities.add(city);
    }

    /**
     * Checks whether a given City exists in the list.
     *
     * @param city the City to check
     * @return true if the city exists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a City from the list if it exists.
     *
     * @param city the City to delete
     * @throws IllegalArgumentException if the city does not exist
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City does not exist in the list");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list.
     *
     * @return the count of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * Returns a sorted list of City objects based on their city names.
     *
     * @return the sorted list of cities
     */
    public List<City> getCities() {
        List<City> list = new ArrayList<>(cities); // avoid modifying the original list
        Collections.sort(list);
        return list;
    }
}
