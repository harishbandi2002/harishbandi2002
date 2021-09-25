import java.util.Scanner;
class power
{
	public static void main(String[] args)
	{
		int x,y,p=1;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter x and y values:");
		x=myObj.nextInt();
		y=myObj.nextInt();
		for(int i=1;i<=y;i++)
			p=p*x;
		System.out.println("Power="+p);
	}
}
