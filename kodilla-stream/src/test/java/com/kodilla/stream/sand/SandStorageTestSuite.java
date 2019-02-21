package com.kodilla.stream.sand;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SandStorageTestSuite {
    private List<SandStorage> continents;

    @Before
    public void beforeEachTest(){
        continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
    }

    @Test
    public void testGetSandBeansQuantity() {
        //When
        BigDecimal totalSand = BigDecimal.ZERO;
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }

    @Test
    public void testGetSandBeansQuantityWithReduce() {
        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)
                //.reduce(BigDecimal.ZERO, BigDecimal::add);
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        Assert.assertEquals(expectedSand, totalSand);
    }

}
