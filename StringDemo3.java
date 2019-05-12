import java.util.*;
class StringDemo3
{
	public static void main(String [] args)
	{
		String sentence;
		System.out.println("Enter the sentence");
		sentence=new Scanner(System.in).nextLine();
		String [] temp=sentence.split("\\s");
		System.out.println("No. of word="+sentence.length());
		System.out.println("No. of word="+temp.length);
	}
}