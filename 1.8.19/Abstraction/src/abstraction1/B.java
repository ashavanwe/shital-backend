package abstraction1;

public class B  extends A
{
public void m3()
{
System.out.println("m3");	
}
public static void main(String[] args)
{
A a=new B();
a.m1();
a.m2();
a.m3();
}
}
