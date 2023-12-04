package Encapsulation;

public class Bank {
	private int totalamount=100000;
	private int pin=5555;
	public void setData(int amount,int key)
	{
		if(pin==key)
		{
			totalamount=totalamount-amount;
		}
		else
		{
			System.out.println("Invalid Customer");
			System.exit(0);
		}
	}
	public int  getData(int key,int amount)
	{
		if(pin==key)
		{
			System.out.println("The given amount is "+amount);
			System.out.println("The updated balance is:"+totalamount);
			return totalamount;
		}
		else
		{
			System.out.println("Invalid Customer");
			return -1;
		}
	}

}
