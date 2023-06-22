package ExceptionHandling;

import java.io.IOException;

public class Throws 
{
	public void add() throws IOException
	{
		System.out.println("Exception");
		
	}

	public static void main(String[] args) throws IOException 
	{
		Throws obj = new Throws();
		obj.add();
		

	}

}
