import java.util.*;
class Task22
{
	public static void main(String [] args)
	{
		String [] Name=new String[5];
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Five string");
		for(i=0;i<5;i++)
		{
			Name[i]=sc.nextLine();
		}
		Arrays.sort(Name);
		for(i=0;i<5;i++)
		{
			System.out.println(Name[i]);
		}	
	}
}	