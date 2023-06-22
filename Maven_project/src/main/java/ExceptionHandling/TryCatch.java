package ExceptionHandling;

public class TryCatch 
{
	public  void add()
	{
		int a=10;
		int d= a*2;
		try
		{
			int c= a/0;
		}
		catch(Exception e)
		{
			System.out.println("CATCH");

		}
		finally
		{
			System.out.println("Final");

		}
		//System.out.println(c);
		System.out.println(d);

				
	}

	public static void main(String[] args) 
	{
		TryCatch obj = new TryCatch();
		obj.add();

	}

}
