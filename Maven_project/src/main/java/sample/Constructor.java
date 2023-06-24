package sample;

public class Constructor 
{
	int c;
	public Constructor(int a,int b)
	{	
	 c= a+b;
	}
	public void print()
	{
		System.out.println("hi");
		System.out.println(c);

	}
	
	public static void main(String[] args) 
	{
		Constructor obj = new Constructor(10,20);
		obj.print();
	}

}
