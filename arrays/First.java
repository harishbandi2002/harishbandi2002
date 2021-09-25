class First
{
	int a=10;
	void update(int newVal)
	{
		a=newVal;
	}
	void display()
	{
		System.out.println("Value of a is:"+a);	
	}
	public static void main(String args[])
	{
		First Object = new First();
		Object.display();
		Object.update(20);
		Object.display();
	}
}
