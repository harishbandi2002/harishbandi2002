//Program on Scanner method


import java.util.Scanner;
public class scanner {
	public static void main(String[]args)
	{
		double total_marks=0;
		double av=0;
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter Student name:");
		String name=myObj.nextLine();
		System.out.print("Enter Regd:");
		int Redgno=myObj.nextInt();
		System.out.print("Enter sub1 marks:");
		double S1=myObj.nextDouble();
		System.out.print("Enter sub2 marks:");
		double S2=myObj.nextDouble();
		System.out.print("Enter sub3 marks:");
		double S3=myObj.nextDouble();
		System.out.print("Enter sub4 marks:");
		double S4=myObj.nextDouble();
		System.out.print("Enter sub5 marks:");
		double S5=myObj.nextDouble();
		total_marks=(S1+S2+S3+S4+S5);
		av=(total_marks/5);
		System.out.println("Student name:"+name);
		System.out.println("Redg no:"+Redgno);
		System.out.println("Total marks"+total_marks);
		System.out.println("Average"+av);
		
		System.out.print("Enter password");
		char[] N1=System.console().readPassword();
		System.out.println(N1);
		
	
	}

}
