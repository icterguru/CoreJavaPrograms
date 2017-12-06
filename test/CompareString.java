package test;
public class CompareString {
	public static void main(String[] args) 	{
		String s1 = new String(" Welcome to Java ");
		String s2=s1;

		s1+= "and Welcome to HTML";
		//int i =s1.length();
		//int j = s2.length();

		char c=s1.charAt(5);
		/*if (s1==s2)
			System.out.println("s1 and s2 reference to the same String object");
		else
			System.out.println("s1 and s2 reference to the different String object");*/
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Length of s1 is : "+s1.length()+" "+"Length of s2 is : "+s2.length());
		System.out.println(s1.charAt(9));
		int b=(s2.compareTo(s1));
		System.out.println(b);
		System.out.println(c);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s2.replace('e', 'E'));
		System.out.println(s2.toCharArray()); 
	}
}
