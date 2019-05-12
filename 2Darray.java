import java.util.*;
class TdArray
{
	public static void main(String [] args)
	{
		int [][] A=new int[3][3];
		int i,j;
         Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the (3*3) matrix");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 A[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("The Element of matrix");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 System.out.print(+A[i][j]+" ");
      			}
		    System.out.print("\n");
		 }
		 

	}
}