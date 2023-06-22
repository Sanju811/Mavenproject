package interfacepackage;

public class Hdfc implements Rbi
{
	
	

	public static void main(String[] args) 
	{ 
		Hdfc obj = new Hdfc();
		obj.recurringDeposit(20000,2);

	}

	public void recurringDeposit(int amount, int duration) {
		System.out.println("Deposit Amount = " +amount);
		System.out.println("Duration in year = " +duration);
		System.out.println("Interest rate = " +interestrate);


		float Interest = amount * interestrate * duration ;
		float Finalamount = amount + Interest;
		System.out.println("final amount after " +duration+ " year is "+Finalamount);
	}

	


}
