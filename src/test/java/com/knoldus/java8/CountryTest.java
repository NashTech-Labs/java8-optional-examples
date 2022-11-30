package com.knoldus.java8;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import org.junit.Test;

public class CountryTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Country}
     *   <li>{@link Country#setCity(City)}
     *   <li>{@link Country#getCity()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Country actualCountry = new Country();
        City city = new City();
        city.setAddress(new ArrayList<>());
        actualCountry.setCity(city);
        assertSame(city, actualCountry.getCity());
    }
}

