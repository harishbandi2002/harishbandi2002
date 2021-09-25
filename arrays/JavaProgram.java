//Program on Narrowing and widening Casting

public class JavaProgram{  
	public static void main(String args[]){  
	int a1=17,a2=017,a3=0x17;
    	double d1=a1;
    	char c1='a';
    	int i4=c1;
    	int i5=(int)f3;
    	int i6=2552222;
    	char c2=(char)i6;
    	float f7=(float)f5;
    	System.out.println("Int1:"+a1);
    	System.out.println("Int Octal:"+a2);
    	System.out.println("Int Hexa:"+a3);
    
    	System.out.println("Widening casting from int to double:"+d1);
    	System.out.println("Widening Casting from char to int:"+i4);
    	System.out.println("Narrowing Casting from double to int:"+d1);
    	System.out.println("Narrowing Casting from float to int:"+f7);
    	System.out.println("Narrowing Casting from int to char:"+c2);
	
}
}
