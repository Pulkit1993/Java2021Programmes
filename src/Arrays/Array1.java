package Arrays;

public class Array1 {
	

	public static void main(String[] args) 
	{
		
		int a[] = {20,30,8,46,52,9,54};
		int key=52;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != key)
			{
				continue;
			}
			else if (a[i] == key)
			{
				System.out.println("Elment found at position " + i);
			}
		}
		
	}

	}
