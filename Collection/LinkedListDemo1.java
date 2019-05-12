import java.util.*;
class LinkedListdemo1
{
   public static void main(String[] args) 
   {
	   LinkedList <String> ll=new LinkedList<String>();
	   ll.add("Ravi ");
	   ll.add("mohan");
	   ll.add("Ashok");
	   ll.addFirst("Achchhelal");
	   ll.addLast("Kamlesh");
	   ListIterator itr=ll.listIterator();
	   System.out.println("LinkedList Element are Forword  Direction :");
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   System.out.println("LinkedList Element are backword  Direction :");
	   while(itr.hasPrevious())
	   {
		   System.out.println(itr.previous());
	   }
   }   
}