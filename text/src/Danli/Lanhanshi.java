package Danli;

public class Lanhanshi {
	
String name;
static Lanhanshi a=null;

private Lanhanshi(){}

public static Lanhanshi getDuixiang()
{
	if(a==null)
	{
		synchronized (Lanhanshi.class)
		{
			if(a==null)
			{
				a=new Lanhanshi();
			}
		}
	}
	return a;
}



}
