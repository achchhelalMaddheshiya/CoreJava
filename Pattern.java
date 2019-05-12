import java.util.*;
class Pattern
{
 public static void main(String [] args)
 {
	 int j,i;
	 System.out.print("Enter the pattern no.");
	 int n=new Scanner(System.in).nextInt();
	 for(i=1;i<=n;i++)
	 {
		 for(j=5;j>=i;j--)
		 {
			 System.out.print("  ");
		 }
		 for(j=1;j<=i;j++)
		 {
			System.out.print(""+i+"   ");
		 }
		 
		 System.out.print("\n");
	 }
 }
}