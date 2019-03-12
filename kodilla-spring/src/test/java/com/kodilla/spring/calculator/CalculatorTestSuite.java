package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result1 = calculator.add(4.25, 2.5);
        double result2 = calculator.sub(7.2, 2.2);
        double result3 = calculator.mul(5, 3.3);
        double result4 = calculator.div(15, 3);
        //Then
        Assert.assertEquals(6.75, result1, 0);
        Assert.assertEquals(5.0, result2, 0);
        Assert.assertEquals(16.5, result3, 0);
        Assert.assertEquals(5.0, result4, 0);
    }
}
