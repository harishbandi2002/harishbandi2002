class Account
{
	double balance;
	void addBalance(double value)
	{
		balance=balance+value;
	}
	double getBalance()
	{
		return balance;
	}
	void Withdrawal(double amount)
	{
		if(amount+1000<=balance)
		{
			balance=balance-amount;	
		}
		else
		{
			System.out.println("No Sufficient Balance");
		}
	}
	public static void main(String args[])
	{
		Account Obj=new Account();
		Obj.addBalance(1000);
		Obj.addBalance(Obj.getBalance()*2);
		System.out.println("Before Withdrawal" +Obj.getBalance());
		Obj.Withdrawal(1000);
		System.out.println("After Withdrawal" +Obj.getBalance());
		
	}
}
