public class Characterinput {
	public static void main(String args[])
	{
		if (args.length==0)
			System.out.println("No Values");
		for(int n=1;n<args.length;n=n+1) {
			System.out.print(args[n]+',');
		
			
		}
		System.out.println("\n");
		for(int i=10;i<=14;i=i+1) {
			if (i%2==0)
				System.out.println(i);
					
		}
		


}
}
