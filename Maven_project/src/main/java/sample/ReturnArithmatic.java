package sample;

public class ReturnArithmatic 
{
	static int a;
	static int b;
	
	public static void SetValueAB(int x, int y)
	{
		a = x;
		b = y;
	}
	
	public static int add()
	{
		int c=a+b;
		return c;
	}
	public static int subtract()
	{
		int s=a-b;
		return s;
	}
	public static int multiply()
	{
		int m=a*b;
		return m;
	}
	public static int divide()
	{
		int d=a/b;
		return d;
	}
	public static void main(String args[])
	{
		ReturnArithmatic.SetValueAB(20,10);
		System.out.println(ReturnArithmatic.add());
		System.out.println(ReturnArithmatic.subtract());
		System.out.println(ReturnArithmatic.multiply());
		System.out.println(ReturnArithmatic.divide());
	}
}


