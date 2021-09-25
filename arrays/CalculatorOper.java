class Calculator
{
	int addition(int a ,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	int subtraction(int a, int b)
	{
		int c;
		c=a-b;
		return c;
	}

}

class CalculatorOper
{
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		int sum=calc.addition(10,20);
		System.out.println("Sum of 10 and 20:" +sum);
		int sub=calc.subtraction(10,20);
		System.out.println("Subtraction of 10 and 20:" +sub);

	}
}
