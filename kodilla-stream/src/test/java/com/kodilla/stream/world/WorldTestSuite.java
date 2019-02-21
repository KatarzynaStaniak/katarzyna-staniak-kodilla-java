package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country japan = new Country("Japan", new BigDecimal("60000005"));
        Country china = new Country("China", new BigDecimal("980000001"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);

        Continent asia = new Continent("Asia");
        asia.addCountry(japan);
        asia.addCountry(china);

        World earth = new World("Earth");
        earth.addContinent(europe);
        earth.addContinent(asia);

        //When
        BigDecimal totalNumberOfPeople = earth.getPeopleQuantity();
        BigDecimal expectedNumberOfPeople = new BigDecimal("1160000006");

        //Then
        Assert.assertEquals(expectedNumberOfPeople, totalNumberOfPeople);
    }

}
