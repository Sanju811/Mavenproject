package interfacepackage;

public class BabyDog implements Dog,Animal
{

	public static void main(String[] args)
	{
		BabyDog obj = new BabyDog();
		obj.print();
		obj.show();
		System.out.println("BabyDog");

	}

	@Override
	public void print() 
	{
		System.out.println(a);
		
	}

	@Override
	public void show() {
		System.out.println(b);
		
	}

}
