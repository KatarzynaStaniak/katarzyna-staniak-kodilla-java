package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        double j = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 3 + i;
            j = j + numbers[i];
        }

        //When
        double actualAvg = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(j / numbers.length, actualAvg, 0);
    }
}
