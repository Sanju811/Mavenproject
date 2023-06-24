package sample;

public class ConstructorPara 
{
	public ConstructorPara(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		ConstructorPara obj = new ConstructorPara(20,10);

	}

}
