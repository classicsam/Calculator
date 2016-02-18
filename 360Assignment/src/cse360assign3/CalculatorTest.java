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
	
	// the value added is reflected in the total
	@Test
	public void testAdd()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		assertEquals(5, calc.getTotal());
	}
	// the value subtracted is reflected in the total
	@Test
	public void testSubtract()
	{
		Calculator calc = new Calculator();
		calc.subtract(5);
		assertEquals(-5, calc.getTotal());
	}

	// Tests multiplication: 0 * 4 = 0
	@Test
	public void testMultiply()
	{
		Calculator calc = new Calculator();
		calc.multiply(4);
		assertEquals(0, calc.getTotal());
	}
	// performs integer division: 5 / 2 = 2
	@Test
	public void testDivide()
	{
		Calculator calc = new Calculator();
		calc.add(5);
		calc.divide(2);
		assertEquals(2, calc.getTotal());
	}
	
	// accounts for division by zero by setting the total
	// to zero
	@Test
	public void testDivideByZero()
	{
		Calculator calc = new Calculator();
		calc.add(2);
		calc.divide(0);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}

}
