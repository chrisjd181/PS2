package Mainpackage;

public class MyInteger {
	
	private int value;
	
	public int getValue() {
		return value;	
	}
	
	private void setValue(int value)
	{
		this.value=value;
	}
	
	public MyInteger(int value)
	{
		setValue(value);
	}
	public boolean isEven()
	{
		if(this.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEven(int value)
	{
		if (value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isEven(MyInteger myInt)
	{
		if (myInt.getValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isOdd()
	{
		if(this.getValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(int value)
	{
		if (value % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isOdd(MyInteger myInt)
	{
		if (myInt.getValue() % 2 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isPrime()
	{
		for(int i = 2; i < this.value; i++)
		{
			if(this.value % 1 == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static boolean isPrime(int value)
	{
		for(int i = 2; i < value; i++)
		{
			if(value % 1 == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(MyInteger myInt)
	{
		for(int i = 2; i < myInt.getValue(); i++)
		{
			if(myInt.getValue() % 1 == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static int parseInt(String x)
	{
		char letter = x.charAt(0);
		return(int) letter;
	}
	public static int parseInt(char[]x)
	{
		int value =0;
		for(int i=0; i<x.length;i++)
			{
			value += x[i];
			}
		return value;
	}
}