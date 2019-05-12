 // Create an ArrayList of objects of a class
import java.util.*;
class Student
{
	int id;
	String Name;
	double fee;
	Student(int id,String Name,double fee)
	{
		this.id=id;
		this.Name=Name;
		this.fee=fee;
	}
}
class ArrayListDemo4
{
	public static void main(String [] args)
	{
		ArrayList<Student> list=new ArrayList<Student>();
		Student s1=new Student(1001,"Achchhelal",50000.00);
		Student s2=new Student(1002,"Adarsh",60000.00);
		Student s3=new Student(1003,"Atul",70000.00);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println("Details of student");
		for(Student element:list)
			System.out.println(+element.id+" "+element.Name+" "+element.fee);
			
	}

}