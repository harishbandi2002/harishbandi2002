//Program using CommandLine arguments
public class Commandlinearg {
	static public void main(String[]args) {
		int i1=Integer.parseInt(args[0]);
		float i2=Float.parseFloat(args[1]);
		float c=i1/i2;
		System.out.println(i1+i2);
		System.out.println("Result is:"+i1+i2+20);
		System.out.println("Result is eq:"+i1+i2+args[2]);
		System.out.println("Output"+c);
	}

}
