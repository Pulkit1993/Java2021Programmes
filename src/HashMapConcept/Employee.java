package HashMapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) 
	{
		// Hash Map is a <Key, Value> pair
		
		HashMap<String, String> emp = new HashMap<String, String>();
		
		emp.put("QTP", "Functional Testing tool");
		emp.put("Selenium", "Web Testing Library");
		emp.put("JMeter", "Functional Testing tool");
		emp.put("Postman", "API   Testing tool");
		
		
		System.out.println(emp.get("QTP"));
		System.out.println(emp.get("Selenium"));
		

	}

}
