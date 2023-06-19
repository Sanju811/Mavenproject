package finalkeyword;

public class FinalMethod1 extends FinalMethod
{
	//final void print() // can't override method
	{
		System.out.println("hi");
	}

	public static void main(String[] args) 
	{
		FinalMethod obj = new FinalMethod();
		obj.print();

	}

}
