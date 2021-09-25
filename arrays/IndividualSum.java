//Program to find individual sum of a number

public class IndividualSum{
	public static void main(String args[])
	{
		
		int z=1234,sum=0,r;
		while(z>0)
		{
			r=z%10;
			sum=sum+r;
			z=z/10;
		}
		System.out.println("Sum of the number is"+sum);


}
}
