package test;

public class StringMethods {

	public static void main(String[] args) {
		String s="Java"; 
		StringBuilder buffer = new StringBuilder(s);
		change(buffer);
		System.out.println(buffer);
		System.out.println("Java is neat".replaceAll("is", "AAA"));
		System.out.println("Hi, ABC, good".matches("ABC")+ " ");
		System.out.println("Hi, ABC, good".matches(".*ABC.*"));
		System.out.println("A,B;C".replaceAll(",;", "#")+" ");
		System.out.println("A,B;C".replaceAll("[,;]", "#")); 
	}
	private static void change(StringBuilder buffer)
	{
		buffer.append (" and HTML");
	}
}