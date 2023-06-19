package abstraction;

public class MainAbstraction extends Abstraction
{	

	public static void main(String[] args) 
	{
		MainAbstraction obj = new MainAbstraction();
		obj.add();
		obj.print();

	}

	@Override
	public void add() 
		{
			System.out.println("Hi");
		}		
	

}
