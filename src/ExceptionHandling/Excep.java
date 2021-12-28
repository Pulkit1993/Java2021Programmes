package ExceptionHandling;

public class Excep 
{
	public static void main(String args[])
	{
	
	int a = 8;
	int b = 0;
	Excep e = new Excep();
	e= null;
	
	System.out.println("Value of a is " + a);
	System.out.println("Value of b is " + b);
	
	try
	{
		//int c = a/b;
		System.out.println(e);
	}
	finally
	{
		System.out.println("finally");
	}
	}
	
	
}
