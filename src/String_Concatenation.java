
public class String_Concatenation {

	public static void main(String[] args) 
	{
		
		String s1="pulkit";
		String s2="";
		int l=s1.length();
		for(int i=l-1; i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		System.out.println(s2);
		

	}

}
