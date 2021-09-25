//Program to find check if a no is palindrome or not

public class Palindrome{
	public static void main(String args[])
	{
		
		int x=Integer.parseInt(args[1]);
	    a=x;
	    r=0;
	    while(x>0)
	    {
	    	int q=x%10;
	    	r=r*10+q;
	    	x=x/10;	    	
	    }
	    if(a==r)
	    	System.out.println("Number is a Palindrome ");
	    else
	    	System.out.println("Not a Palindrom ");

}
}
