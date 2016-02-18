package cse360assign3;
/**
 * This class functions just as a simple calculator does. It performs
 * addition, subtraction, multiplication, and division. Furthermore, 
 * it tracks all past calculations.
 * 
 * @author Samantha Classen (PIN #: 220)
 *
 */

public class Calculator 
{
	/** The running total that is added, subtracted, multiplied, and divided from. */
	private int total;
	
	/**
	 * This constructor initially has a total of 0.
	 */
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This will return the total.
	 * @return running total
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Adds the given value to the total.
	 * @param value to be added
	 */
	public void add (int value)
	{
		total = total + value;
	}
	
	/**
	 * Subtracts the given value from the total.
	 * @param value to be subtracted
	 */
	public void subtract (int value)
	{
		total = total - value;
	}
	
	/**
	 * Multiples the total by the given value.
	 * @param value will by multiplied with the total
	 */
	public void multiply (int value)
	{
		total = total * value;
	}
	
	/**
	 * Divides the total by the given value.
	 * @param value will used to divide the total
	 */
	public void divide (int value)
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
	}
	
	/**
	 * Returns the history of calculations involving the total.
	 * @return a string describing these calculations
	 */
	public String getHistory ()
	{
		return "";
	}
}