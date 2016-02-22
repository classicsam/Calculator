package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{

	// makes sure that constructor is properly instantiated
	@Test
	public void testCalculator()
	{
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}
	
	// returns the default total (zero) of a newly instantiated Calculator
	@Test
	public void testGetTotal()
	{
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
	}
	
	// the positive/negative value added is reflected in the total
	@Test
	public void testAddPos()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5, calc.getTotal());
	}
	
	@Test
	public void testAddNeg()
	{
		Calculator calc = new Calculator();
		calc.add(-5);
		assertEquals(-5, calc.getTotal());
	}
	
	// the positive/negative value subtracted is reflected in the total
	@Test
	public void testSubtractPos()
	{
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
	}

	@Test
	public void testSubtractNeg()
	{
		Calculator calc = new Calculator();
		calc.subtract(-5);
		assertEquals(5, calc.getTotal());
	}
	
	// Tests multiplication: 0 * 4 = 0
	@Test
	public void testMultiplyWithZero()
	{
		Calculator calc = new Calculator();
		calc.multiply(4);
		assertEquals(0, calc.getTotal());
	}
	
	// checking multiplication with positive and negative integers
	@Test
	public void testMultiplyPos()
	{
		Calculator calc = new Calculator();
		calc.add(2);
		calc.multiply(4);
		assertEquals(8, calc.getTotal());
	}
	
	@Test
	public void testMultiplyNeg()
	{
		Calculator calc = new Calculator();
		calc.add(2);
		calc.multiply(-4);
		assertEquals(-8, calc.getTotal());
	}
	
	// performs integer division: 5 / 2 = 2
	@Test
	public void testDividePos()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(2);
		assertEquals(2, calc.getTotal());
	}
	
	// negative integer division
	@Test
	public void testDivideNeg()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(-2);
		assertEquals(-2, calc.getTotal());
	}
	
	// accounts for division by zero by setting the total to zero
	@Test
	public void testDivideByZero()
	{
		Calculator calc = new Calculator();
		calc.add(2);
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}
	
	// returns the correct history string after a series of calculations
	@Test
	public void testGetHistory()
	{
		Calculator calc = new Calculator();
		calc.add(4);
		calc.subtract(2);
		calc.multiply(2);
		calc.add(5);
		calc.divide(0);
		assertEquals("0 + 4 - 2 * 2 + 5 / 0", calc.getHistory());
		assertEquals(0, calc.getTotal());
	}

}
