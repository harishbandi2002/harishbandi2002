class A 
{
    void m1()
    {
        System.out.println("inside a's m1 method");
    }
}
class B extends A 
{
    void m1()
    {
        System.out.println("inside b's m1 method");
    }
void disp()
{
    System.out.println("inside disp method");
}
}
class Main 
{
    public static void main(String args[])
{
    A a=new A();
    B b=new B();
    A ref;
    ref.m1();
    ref=b;
    ref.m1();
}
