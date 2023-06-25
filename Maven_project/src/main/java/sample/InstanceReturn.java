package sample;

public class InstanceReturn 
{
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);

	}

	public static void main(String[] args) 
	{
		InstanceReturn obj = new InstanceReturn();
		obj.add(20,5);

	}

}
