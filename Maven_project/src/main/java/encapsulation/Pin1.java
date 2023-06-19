package encapsulation;

import java.util.Scanner;

public class Pin1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pin");
		int pin = sc.nextInt();
		Pin obj = new Pin();
		obj.setName(pin);
		obj.getName();
		obj.verify();

	}

}
