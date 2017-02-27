package pkgEmpty;

	public class MyInteger {
	
		private int iValue;
	
	public MyInteger(int iValue) 
	{
		this.iValue = iValue;
	}
	
	public boolean isPrime()
	{
		for(int i = 2;i < iValue;i++) 
	        if(iValue % i==0)
	            return false;
	    return true;
	}
	
	public int getiValue() 
	{
		return iValue;
	}
	
	public boolean isEven() 
	{
		if ((iValue % 2) == 0)
			return true;
		else
			return false;
	}
	
	
	public boolean isOdd() 
	{
		if ((iValue % 2) == 1)
			return true;
		else
			return false;
	}
	public static boolean isEven(int x) 
	{
		if ((x % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int x) 
	{
		if ((x % 2) == 1)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int x)
	{
		for(int i = 2;i < x;i++) 
	        if((x % i) == 0)
	            return false;
	    return true;
	}
	
	public static boolean isEven(MyInteger number) 
	{
		return number.isEven();
	}
	
	public static boolean isOdd(MyInteger number) 
	{
		return number.isOdd();
	}
	
	public static boolean isPrime(MyInteger number)
	{
		return number.isPrime();
	}
	
	public boolean equals(int x)
	{
		return (x == this.iValue);
	}
	
	public boolean equals(MyInteger number)
	{
		return (number.getiValue() == this.iValue);
	}
}