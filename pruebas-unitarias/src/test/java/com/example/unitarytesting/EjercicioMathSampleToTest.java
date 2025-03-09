package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;

public class EjercicioMathSampleToTest {
    @Test
    public void sunTest(){
        MathSample mat = new MathSample();
        //Arrange
        final Integer a = 2;
        final Integer b = 2;
        //Act
        Integer result = mat.sum(a, b);
        //Assert
        Assert.assertEquals(Integer.valueOf(4), result);
    }

    @Test
    public void mulTest(){
        MathSample mat = new MathSample();
        //Arrange
        final Integer a = 2;
        final Integer b = 2;
        //Act
        Integer result = mat.mulitply(a, b);
        //Assert
        Assert.assertEquals(Integer.valueOf(4), result);
    }
}
