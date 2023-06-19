package encapsulation;

public class Pin 
{
private int pin;

public void setName(int pin)
{
	this.pin = pin;
}
public int getName()
{
	return pin;
}

public void verify()
{
	if (pin == 1001)
	{
		System.out.println("VALID PIN");
		
	}
	else if(pin == 1234)
	{
		System.out.println("VALID PIN");

	}
	else if(pin == 1212)
	{
		System.out.println("VALID PIN");

	}
	else
	{
		System.out.println("INVALID PIN");

	}

}
}
