class subclass
{
	String msg="Hello";
	String myname;
	void display(String name)
	{
		myname=name;
		System.out.println(msg+name);
	}
}

class ClassMain
{
	public static void main(String args[])
	{
		subclass sc1=new subclass();
		subclass sc2=new subclass();	
		subclass sc3=new subclass();
		sc1.display("Sai kiran");
		sc2.display("Nandan");
		sc3.display("Vamsi");
		System.out.println(sc1.myname+","+sc2.myname +","+sc3.myname);	
	}	
}
