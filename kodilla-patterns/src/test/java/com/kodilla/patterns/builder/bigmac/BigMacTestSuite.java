package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BigMacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.SIMPLE_BUN)
                .burgers(3)
                .sauce(Bigmac.THOUSAND_ISLAND_SAUCE)
                .ingredient(Bigmac.ONION)
                .ingredient(Bigmac.BACON)
                .ingredient(Bigmac.LETTUCE)
                .build();

        //When
        String bun = bigmac.getBun();
        int burgers = bigmac.getBurgers();
        String sauce = bigmac.getSauce();
        List<String> ingredients = bigmac.getIngredients();

        //Then
        Assert.assertEquals(Bigmac.SIMPLE_BUN, bun);
        Assert.assertEquals(3, burgers);
        Assert.assertEquals(Bigmac.THOUSAND_ISLAND_SAUCE, sauce);
        Assert.assertEquals(3, ingredients.size());
    }
}
