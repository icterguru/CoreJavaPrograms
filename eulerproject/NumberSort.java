package eulerproject;

public class NumberSort 
{
	public void sort(int[] intArr) 
		{

		for (int i=0; i<intArr.length; i++)
		{
			for (int j=0; j<intArr.length; j++)
			{
				swap(intArr, i, j);
			}
		}
	}

	private void swap(int[] intArr, int i, int j) 
	{
		if (intArr[i] < intArr[j])
		{
			int temp = intArr[i];
			intArr[i]=intArr[j];
			intArr[j]=temp;	
		}
	}

	/*public static void main(String[] args)
	{
		int[] intA = {23, 21, 45, 76, 34, 25};
		NumberSort NS = new NumberSort();
		int[] result = NS.sort(intA);
		System.out.println(result);
	}*/

}






