//Program to Ignore the numbers 6 and 7 and cal the sum of numbers which are not in boundaries of 6 and 7
public class Arrays 
{
	public static void main(String[] args)
	{
		int[] arr5= {1,2,3,4,5,6,7,8,7};
		int len5=arr5.length;
		int totalsum = 0;
		int ignoredsum=0;
		int lowerbound=6;
		int upperbound=7;
		int result=0;
		int flag=0;
		for(int i=0;i<len5;i++) 
		{
			totalsum=totalsum+arr5[i];
			if(arr5[i]==lowerbound)
			{
				flag=1;
			}
			if(flag==1)
			{
				ignoredsum=ignoredsum+arr5[i];
			}
			if(arr5[i]==upperbound)
			{
				flag=2;	
			}		
		}
		if(flag==1)
		{
			result=totalsum;
		}
		if(flag==2)
		{
			result=totalsum-ignoredsum;
		}
		System.out.println(result);
				
		 
	}
}

		
