
class A
{
void m1()
{
System.out.println("inside A's m1 method");
}
}
class B extends A
{
void m1()
{
System.out.println("Inside B's m1 method");
}
void disp()
{
System.out.println("Inside disp Method");
}
}
class Main
{
public static void main(String args[])
{
A a = new A();
B b = new B();
A ref;
ref = a;
ref.m1();
ref.m1();
}
}


