package test;

public class ReverseString {

	public static void main(String[] args) 
	{
		String word = "Baskar";
		char[] chs = word.toCharArray();

		int i=0, j=chs.length-1;

		while (i<j)
		{
			char t = chs[i];
			chs[i] = chs[j];
			chs[j] = t;
			i++; j--;
		}
		System.out.println(chs);
	}   
}
