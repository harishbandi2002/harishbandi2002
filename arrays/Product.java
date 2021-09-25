import java.util.Scanner;
class Product
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n;
		System.out.println("Enter the n value:");
		n=obj.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the Array values:");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Enter the Product:");
		int product=obj.nextInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]*a[j]==product)
				{
					System.out.println("True");
					System.exit(0);
				}	
			}
		}
		System.out.println("False");
		
	}
}
