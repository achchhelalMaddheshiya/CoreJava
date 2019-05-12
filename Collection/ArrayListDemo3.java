// Merge sort demonstrater in Arraylist
import java.util.*;
class ArrayListDemo3
{
	public static void main(String [] args)
	{
		System.out.println("The merge Array of first");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Achchhelal Maddheshiya");
		al1.add("Madhav");
		al1.add("Raghav");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("kanchan");
		al2.add("mahesh");
		al1.addAll(al2);
		Collections.sort(al1);
		System.out.println("Elementsn in sorted order");
		for(String element:al1)
		{
			System.out.println(element);
		}
		
	}

}