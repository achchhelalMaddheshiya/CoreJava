import java.util.*;
class Pattern2
{
 public static void main(String [] args)
 {
	 int j,i,c=65;
	 System.out.print("Enter the pattern no.");
	 int n=new Scanner(System.in).nextInt();
	 for(i=1;i<=n;i++)
	 {
		 for(j=n;j>=i;j--)
		 {
			 System.out.print("  ");
		 }
		 for(j=1;j<=i;j++)
		 {
			System.out.print((char)c+"   ");
		 }
		 
		 System.out.print("\n");
		 c++;
	 }
	 for(i=1;i<=n;i++)
	 {
		 for(j=1;j<=i;j++)
		 {
			 System.out.print("  ");
		 }
		 for(j=n;j>i;j--)
		 {
			System.out.print(" "+(char)c+"   ");
		 }
		 
		 System.out.print("\n");
		 c++;
	 }
 }
}