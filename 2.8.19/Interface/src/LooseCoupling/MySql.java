package LooseCoupling;

public class MySql implements Connection
{
	public void commit()
	{
	System.out.println("Commit--MySql");	
	}
	public void rollback()
	{
	System.out.println("rollback--MySql");	
	}
}
