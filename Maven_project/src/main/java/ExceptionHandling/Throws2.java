package ExceptionHandling;

import java.io.IOException;

public class Throws2 

	{
		public void show()throws IOException
		{  
			int a=10, b=0;
			int c=a/b;
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



