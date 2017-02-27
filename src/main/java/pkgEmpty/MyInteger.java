package pkgEmpty;

	public class MyInteger {
	
		private int iValue;
	
	public MyInteger(int iValue) 
	{
		this.iValue = iValue;
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
	
	public boolean isPrime()
	{
		for(int i = 2;i < iValue;i++) 
	        if((iValue % i) == 0)
	            return false;
	    return true;
	}
	
	public static boolean isEven(int n) 
	{
		if ((n % 2) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isOdd(int n) 
	{
		if ((n % 2) == 1)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int n)
	{
		for(int i = 2;i < n;i++) 
	        if((n % i) == 0)
	            return false;
	    return true;
	}
	
	public static boolean isEven(MyInteger num) 
	{
		return num.isEven();
	}
	
	public static boolean isOdd(MyInteger num) 
	{
		return num.isOdd();
	}
	
	public static boolean isPrime(MyInteger num)
	{
		return num.isPrime();
	}
	
	public boolean equals(int n)
	{
		return (n == this.iValue);
	}
	
	public boolean equals(MyInteger num)
	{
		return (num.getiValue() == this.iValue);
	}
}