package org.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import org.example.service.Exercise;
import org.example.service.ExerciseImpl;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    Exercise exercise = new ExerciseImpl();

    @Test
    public void countPositiveSumNegative(){

        int[] expectedResult = new int[]{4, -32};
        assertArrayEquals(expectedResult, exercise.countPositiveSumNegatives(new int[]{4, 5, 6, 10, -11, -1, -20}));
    }

    @Test
    public void countPositiveSumNegativeWithZeroes(){

        int[] expectedResult = new int[]{3, -32};
        assertArrayEquals(expectedResult, exercise.countPositiveSumNegatives(new int[]{4, 5, 0, 10, -11, -1, -20}));

    }

    @Test
    public void countPositiveSumNegativeWithNull(){

        int[] expectedResult = new int[]{3, -32};
        assertArrayEquals(expectedResult, exercise.countPositiveSumNegatives(new int[]{}));

    }
}
