package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrderAllGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheeseDecorator(order);
        order = new TomatoesDecorator(order);
        order = new MushroomsDecorator(order);
        order = new HamDecorator(order);
        System.out.println(order.getCost());
        //When
        BigDecimal price = order.getCost();
        //Then
        assertEquals(new BigDecimal(25), price);
    }

    @Test
    public void testPizzaOrderAllGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new CheeseDecorator(order);
        order = new TomatoesDecorator(order);
        order = new MushroomsDecorator(order);
        order = new HamDecorator(order);
        System.out.println(order.getDescription());
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Pizza ingredients: base + sauce + cheese + extra cheese + tomatoes + mushrooms + ham", description);
    }
}
