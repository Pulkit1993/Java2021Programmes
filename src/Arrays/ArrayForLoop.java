package Arrays;

public class ArrayForLoop {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		int sum = 0;
		a[0] = 5;
		a[1] = 6;
		a[2] = 23; 
		a[3] = 445;
		//a[-1] = 33;
		for(int i=0; i<4; i++)
		{
			System.out.println("Value at " + i + " is " + a[i]);
			sum = sum + a[i];
			
		}
		System.out.println("Sum is " + sum);
		

	}

}
