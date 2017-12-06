
package test;

public class GradeCalc 
{
	public static void main(String[] args) 
	{
		System.out.println("The grade is "+ printGrade(90.1));

		System.out.println("The grade is "+printGrade(80.2));
	}
	public static char printGrade(double score)
	{
		if(score >= 90)
		{
			return 'A';
		}
		else if (score >=80)
		{
			return 'B';
		}
		else if (score >=70)
		{
			return 'C';
		}
		else if (score >=60)
		{
			return 'D';
		}
		else 
		{
			return 'F';
		}
	}
}
