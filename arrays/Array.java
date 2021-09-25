//Program to Insert an element at a specific position
public class Arrays{
	public static void main(String[] args) {
		
		 
		int[]arr3= {1,2,3,4,5,6,7,8,9};
		int len3=arr3.length;
		int[]arr4=new int[len3+1];
		int len4=arr4.length;
		int value=Integer.parseInt(args[0]);
		int position=Integer.parseInt(args[1]);
		for(int i=0;i<len4;i++)
		{
			if(i<(position-1)) 
			{
				arr4[i]=arr3[i];	
			}
			if(i==(position-1))
			{
				arr4[i]=value;
			}
			if(i>(position-1))
			{
				arr4[i]=arr3[i-1];
			}
			
			System.out.println(arr4[i]);
		 


}
}
