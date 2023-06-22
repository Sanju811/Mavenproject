package ExceptionHandling;

public class TryMultipleCatch 
{

	public static void main(String[] args) 
	{ 	int[] a = new int[10]; 
		try
		{
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");

		}
		
		System.out.println("EXCEPTION");

	}

}
