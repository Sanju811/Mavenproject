package sample;

public class InstancePara 
{
	public void show(String name,int age) 
	{
		System.out.println(name+ " " +age);
	}

	public static void main(String[] args) 
	{
		InstancePara obj = new InstancePara();
		obj.show("Sanju",25);

	}

}
