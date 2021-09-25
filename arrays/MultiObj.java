class MyClass
{
	int a;
	void display()
	{
		System.out.println(a);
	}	
}

class MultiObj
{
	public static void main(String args[])
	{
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass();
		obj1.a=10;
		obj2.a=20;
		obj1.display();
		obj2.display();
		obj1.a=15;
		obj1.display();
		obj2.display();
	}
}
