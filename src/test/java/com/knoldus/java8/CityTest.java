package com.knoldus.java8;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CityTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link City}
     *   <li>{@link City#setAddress(List)}
     *   <li>{@link City#getAddress()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        City actualCity = new City();
        ArrayList<String> stringList = new ArrayList<>();
        actualCity.setAddress(stringList);
        assertSame(stringList, actualCity.getAddress());
    }
}

