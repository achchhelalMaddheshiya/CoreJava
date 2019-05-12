import java.util.*;
class ArrayListDemo2
{
	public static void main(String [] args)
	{
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Achchhelal");
		al.add("Achchhelal2");
		al.add("Achchhelal3");
		al.add("Achchhelal4");
		Collections.sort(al);
		Collections.reverse(al);
		Iterator itr=al.iterator();  //(here Iterator is the Interface)
		System.out.println("Element of list in Ascending order");
		while(itr.hasNext())           // hasNext() it return the boolean value
		{
			System.out.println(itr.next());   // next() it give the object
		}
	}
	
}
