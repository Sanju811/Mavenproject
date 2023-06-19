package finalkeyword;

public class FinalVariable 
{
	final int a=10;
	public void print()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		FinalVariable obj = new FinalVariable();
		obj.print();
		System.out.println(obj.a);
	}

}
