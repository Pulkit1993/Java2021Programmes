package Arrays;

import java.util.ArrayList;

public class DynamicArray 
{
	public static void main(String args[])
	{
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size());
		ar.add(20);
		System.out.println(ar.size());
		ar.add(25);
		ar.add(35);
		ar.add("Pulkit");
		System.out.println(ar.size());
		
		System.out.println(ar);
		
		
	}
}
