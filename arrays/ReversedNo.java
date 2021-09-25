//Program to reverse the number

public class ReversedNo{
	public static void main(String args[])
	{
		
		int a = 1234, rev = 0;
	    while(a!= 0) 
	    {
	    
	      int d = a % 10;
	      rev = rev * 10 + d;
	      a= a/10;
	    }
	    System.out.println("Reversed number of 1234 is "+rev);
	    

}
}
