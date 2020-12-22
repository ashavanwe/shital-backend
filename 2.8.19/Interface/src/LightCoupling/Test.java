package LightCoupling;

public class Test 
{
public static void main(String[] args) 
{
	Oracle or=new Oracle();
	or.commit();
	or.rollback();
	MySql my=new MySql();
	my.commit();
	my.rollback();
}
}
