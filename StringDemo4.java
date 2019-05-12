import java.util.*;
class StringDemo4
{
	public static void main(String [] args)
	{
		String str,fw,rw;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the main String: ");
		str=sc.nextLine();
		System.out.println("Find what ?");
		fw=sc.nextLine();
		System.out.println("replace what ? ");
		rw=sc.nextLine();
		System.out.println("String after th modify: "+str.replace(fw,rw));
	}
}