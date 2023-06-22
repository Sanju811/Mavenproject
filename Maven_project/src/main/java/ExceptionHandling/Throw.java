package ExceptionHandling;

public class Throw 
{
	public void print(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible");
			
		}
		else
		{
			throw new ArithmeticException("Not eligible");

		}
		
		
	}
	public static void main(String[] args) 
	{
		Throw obj = new Throw();
		obj.print(17);

	}

}
