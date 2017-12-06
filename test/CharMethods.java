package test;

public class CharMethods {
	public static void main(String[] args) {
		
		
		/*Scanner scan= new Scanner(System.in);
		double v1 = scan.nextDouble();
		double v2 = scan.nextDouble();
		String line = scan.nextLine(); */

		StringBuilder buffer = new StringBuilder("Z");
		//buffer.append('A');
		//System.out.println(buffer);
		buffer.append("ABCDE");
		buffer.delete(1, 3);
		System.out.println(buffer);
		System.out.println(" What's buffer.charAt(2)?"+buffer.charAt(2));
	}
}