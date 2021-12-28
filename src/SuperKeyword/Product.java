package SuperKeyword;

public class Product 
{
	int maxPrice = 100;
	
	public Product()
	{
		System.out.println("Max price of the product is " + maxPrice);
	}
	
	public static void main(String[] args) 
	{
		Product p = new Product();
		System.out.println(p.maxPrice);
		

	}

}
