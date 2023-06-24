package ExceptionHandling;

import java.io.IOException;

public class ThrowThrows
{
	public void show()throws IOException
	{  
	    throw new IOException("Error"); 
	  }  
	public void display() throws IOException
	{
		show();
	}

	public void print()
	{
		
		try 
		{
			display();
		}
		catch(Exception e)
		{
			System.out.println("Exception");

		}
					
	}

	public static void main(String[] args) 
	{
		ThrowThrows obj = new ThrowThrows();
		obj.print();
		System.out.println("Normal flow");

	}

}
