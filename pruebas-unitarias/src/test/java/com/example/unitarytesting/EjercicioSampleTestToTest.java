package com.example.unitarytesting;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class EjercicioSampleTestToTest {

    @Test
    public void concatStringOk() {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final String var1 = "texto flipante";
        //Act
        final String result = sampleToTest.concatString(var1);
        //Assert
        Assert.assertEquals("texto flipante - concatenated", result);
    }

    @Test
    public void concatStringNull() {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final String var1 = null;
        final String var2 = null;

        //Act
        final String result = sampleToTest.concatString(var1, var2);
        //Assert
        Assert.assertEquals(null, result);
    }

    @Test
    public void concatString2Ok() {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final String var1 = "Texto flipante";
        final String var2 = null;

        //Act
        final String result = sampleToTest.concatString(var1, var2);
        //Assert
        Assert.assertEquals(var1 + " - not value", result);
    }

    @Test
    public void concatString3Ok() {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final String var1 = null;
        final String var2 = "Texto flipante";
        //Act
        final String result = sampleToTest.concatString(var1, var2);
        //Assert
        Assert.assertEquals("not value - " + var2, result);
    }

    @Test
    public void concatString1Ok() {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final String var1 = "pero flipante";
        final String var2 = "Texto flipante";
        //Act
        final String result = sampleToTest.concatString(var1, var2);
        //Assert
        Assert.assertEquals("pero flipante - Texto flipante", result);
    }

    @Test
    public void mathOperation2() throws OperationNotSupportedException {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final Integer var1 = 9;
        final Integer var2 = 3;
        final String oper = "+";
        //Act
        final Number result = sampleToTest.mathOperation(var1, var2, oper);
        //Assert
        Assert.assertEquals(12, result);
    }

    @Test
    public void mathOperation3() throws OperationNotSupportedException {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final Integer var1 = 9;
        final Integer var2 = 3;
        final String oper = "*";
        //Act
        final Number result = sampleToTest.mathOperation(var1, var2, oper);
        //Assert
        Assert.assertEquals(27, result);
    }

    @Test
    public void mathOperation4() throws OperationNotSupportedException {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final Integer var1 = 9;
        final Integer var2 = 3;
        final String oper = "/";
        //Act
        final Number result = sampleToTest.mathOperation(var1, var2, oper);
        //Assert
        Assert.assertEquals(3d, result);
    }
/////////////////////////////////////////////////////////////////////////////
    @Test
    public void mathOperation5() throws OperationNotSupportedException {
        //Arrange (preparación)
        final SampleToTest sampleToTest = new SampleToTest();
        final Integer var1 = 9;
        final Integer var2 = 3;
        final String oper = "x";
        //Act
        final Number result = sampleToTest.mathOperation(var1, var2, oper);
        //Assert

    }



}
