package com.example.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Unit tests for the CityList class.
 */
class CityListTest {

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Edmonton", "Alberta"); // same as mock
        assertThrows(IllegalArgumentException.class, () -> cityList.add(city));
    }

    @Test
    void testHasCity() {
        CityList cityList = mockCityList();
        assertTrue(cityList.hasCity(mockCity()));
        assertFalse(cityList.hasCity(new City("Toronto", "Ontario")));
    }

    @Test
    void testDelete() {
        CityList cityList = mockCityList();
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteException() {
        CityList cityList = mockCityList();
        City city = new City("Toronto", "Ontario");
        assertThrows(IllegalArgumentException.class, () -> cityList.delete(city));
    }

    @Test
    void testCountCities() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));
        assertEquals(2, cityList.countCities());
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        List<City> sorted = cityList.getCities();
        assertEquals("Charlottetown", sorted.get(0).getCityName());
        assertEquals("Edmonton", sorted.get(1).getCityName());
    }
}
