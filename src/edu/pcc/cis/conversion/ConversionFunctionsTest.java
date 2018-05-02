package edu.pcc.cis.conversion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A series of tests for the library of conversion functions.
 *
 * @author Charles Leonard (@orig Cara Tang?)
 * @version 2018.05.01
 */
public class ConversionFunctionsTest {

    // celsiusToFahrenheit tests ---------------------------------------------------------------------------
    @Test
    public void celsius0IsFahrenheit32() {
        assertEquals(32, ConversionFunctions.celsiusToFahrenheit(0));
    }

    @Test
    public void celsius16IsFahrenheit61() {
        assertEquals(61, ConversionFunctions.celsiusToFahrenheit(16));
    }

    // DONE: Write a test for a negative celsius that converts to a positive fahrenheit
    @Test
    public void celsiusNeg5IsFahrenheit23() {
        assertEquals(23, ConversionFunctions.celsiusToFahrenheit(-5));
    }

    // DONE: Write a test for a negative celsius that converts to a negative fahrenheit
    @Test
    public void celsiusNeg25IsFahrenheitNeg13() {
        assertEquals(-13, ConversionFunctions.celsiusToFahrenheit(-25));
    }

    // DONE: Write a test for a celsius value that converts to 0 fahrenheit
    @Test
    public void celsiusNeg18IsFahrenheit0() {
        assertEquals(0, ConversionFunctions.celsiusToFahrenheit(-18));
    }

    // cupsToTablespoons tests ---------------------------------------------------------------------------
    // DONE: Write a test for 0 cups converts to 0 tablespoons - run the test & see that it passes
    @Test
    public void noCupsIsNoTablespoons() {
        assertEquals(0, ConversionFunctions.cupsToTablespoons(0));
    }

    // DONE: Write a test for 1 cup converts to 16 tablespoons
    @Test
    public void oneCupIs16Tablespoons() {
        assertEquals(16, ConversionFunctions.cupsToTablespoons(1));
    }
    // DONE: Run the test & see that it fails. Failing tests reveal bugs.
    // DONE: Fix the implementation of cupsToTablespoons so that this test passes

    // DONE: Write one or two additional tests for cupsToTablespoons
    @Test
    public void threeCupsIs48Tablespoons() {
        assertEquals(48, ConversionFunctions.cupsToTablespoons(3));
    }

    @Test
    public void fifteenCupsIs240Tablespoons() {
        assertEquals(240, ConversionFunctions.cupsToTablespoons(15));
    }


    // monthNumToMonthName tests ---------------------------------------------------------------------------
    // DONE: Complete the test below so that it tests all valid months
    @Test
    public void months1through12AreJanuaryThroughDecember() {
        assertEquals("january", ConversionFunctions.monthNumToMonthName(1).toLowerCase());
        assertEquals("february", ConversionFunctions.monthNumToMonthName(2).toLowerCase());
        assertEquals("march", ConversionFunctions.monthNumToMonthName(3).toLowerCase());
        assertEquals("april", ConversionFunctions.monthNumToMonthName(4).toLowerCase());
        assertEquals("may", ConversionFunctions.monthNumToMonthName(5).toLowerCase());
        assertEquals("june", ConversionFunctions.monthNumToMonthName(6).toLowerCase());
        assertEquals("july", ConversionFunctions.monthNumToMonthName(7).toLowerCase());
        assertEquals("august", ConversionFunctions.monthNumToMonthName(8).toLowerCase());
        assertEquals("september", ConversionFunctions.monthNumToMonthName(9).toLowerCase());
        assertEquals("october", ConversionFunctions.monthNumToMonthName(10).toLowerCase());
        assertEquals("november", ConversionFunctions.monthNumToMonthName(11).toLowerCase());
        assertEquals("december", ConversionFunctions.monthNumToMonthName(12).toLowerCase());


    }

    // DONE: Complete the test below for a variety of invalid month numbers; be sure to include bounds
    // DONE: Run the test and see that it fails. Failing tests reveal bugs.
    // DONE: Fix the implementation of monthNumToMonthName so that this test passes
    @Test
    public void invalidMonthReturnsEmptyString() {
        assertEquals("", ConversionFunctions.monthNumToMonthName(0).toLowerCase());
        assertEquals("", ConversionFunctions.monthNumToMonthName(-1).toLowerCase());
        assertEquals("", ConversionFunctions.monthNumToMonthName(13).toLowerCase());
        assertEquals("", ConversionFunctions.monthNumToMonthName(1300).toLowerCase());
    }
}