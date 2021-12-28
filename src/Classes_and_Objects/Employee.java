package Classes_and_Objects;

public class Employee {
	
	// class --> blueprint of all objects of same category
	// class is a concept
	// class template --> create the object 
	
	// class variable will be common for all objects , but there values will be different
	// class properties
	
	String name;
	int age;
	double salary;
	boolean isActive;
	
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(); // e1 is the object reference // RHS is the object
		
		e1.name= "Pulkit";
		e1.age = 25;
		e1.salary = 512.32;
		e1.isActive = true;
		
	//	System.out.println(e1.name + " " + );
		 
		

	}

}
