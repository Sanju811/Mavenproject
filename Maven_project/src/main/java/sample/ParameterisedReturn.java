package sample;

public class ParameterisedReturn 
{
	static int a;
	static int b;

public static void setvalueab(int x, int y)
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
	ParameterisedReturn.setvalueab(20,10);
	System.out.println(ParameterisedReturn.add());
	System.out.println(ParameterisedReturn.subtract());
	System.out.println(ParameterisedReturn.multiply());
	System.out.println(ParameterisedReturn.divide());
}
}
