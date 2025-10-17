package com.example.listycity;

/**
 * This is a class that defines a City.
 * Each City object stores the name of the city and its province.
 */
public class City implements Comparable<City> {

    /** The name of the city */
    private String city;

    /** The name of the province */
    private String province;

    /**
     * Constructs a new City with the given name and province.
     *
     * @param city the name of the city
     * @param province the name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     *
     * @return the name of the city
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     *
     * @return the name of the province
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this City with another City based on the city name.
     *
     * @param other the other City to compare to
     * @return 0 if names are equal, negative if this city comes before, positive otherwise
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Checks equality based on city name and province.
     *
     * @param obj the object to compare
     * @return true if both city name and province are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Generates a hash code based on city name and province.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}

