import java.util.*;
class ArrayListDemo1
{
	public static void main(String [] args)
	{
		ArrayList <String> al=new ArrayList<String>(); //Blank ArrayList
		al.add("Achchhelal");
		al.add("Achchhelal1");
		al.add("Achchhelal2");
		al.add("Achchhelal3");
		al.add("Achchhelal4");
		al.add("Achchhelal5");
		System.out.println("Elements of list");
		for(String element:al)
		{
			System.out.println(element);
		}
	}
}