package ExOfMultiInheritence;

public class C implements A,B
{

	@Override
	public void m1() 
	{
	System.out.println("m1");	
		
	}
public static void main(String[] args)
{
   A a=new C();
   a.m1();

   B b=new C();
   b.m1();
   
   C c=new C();
   c.m1();

}
}
