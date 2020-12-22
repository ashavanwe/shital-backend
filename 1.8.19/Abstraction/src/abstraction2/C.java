package abstraction2;

public class C extends B
{
	
		public void m2()
		{
			System.out.println("m2-----CCCCCCC");
		}
		
		public static void main(String[] args)
		{
	A a=new C();
	a.m1();
	a.m2();
	a.m3();
	
	B b=new C();
	b.m1();
	b.m2();
	b.m3();
	
		C c=new C();
	    c.m1();
	    c.m2();
	    c.m3();
}
}
