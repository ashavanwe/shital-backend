
package LooseCoupling;

public class Test 
{
public static void main(String[] args)
{
  Connection con=new Oracle();
  con.commit();
  con.rollback();

//  Connection con=new Oracle();
//  con.commit();
//  con.rollback();
}
}
