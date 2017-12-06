package Collections;

import java.util.ArrayList;

import com.Employee;
public class ArrayListCode 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Anurag","324",6578, "Developer");
		Employee e2=new Employee("Baskar","123",4999, "Manager");
		Employee e3=new Employee("Tarun","543", 7178, "Developer");

		ArrayList<Employee> list=new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		System.out.println(list.size());

		for(int i=0;i<list.size();i++)
		{
			Employee temp=list.get(i);  //doesn't delete anything

			if (temp.salary<6000)
			{
				System.out.println(temp.fullName);
			}
		}
	}
}