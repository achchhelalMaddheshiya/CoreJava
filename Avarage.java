//Wap to find the avarage of 10 numbers using array
import java.util.Scanner;
class Avarage
{
public static void main(String [] args)
{
	int x[]=new int[10];
	int i,sum=0;
	float avarage;
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the ten numbers");
	for(i=0;i<10;i++)
	{
		x[i]=sc.nextInt();
		sum=sum+x[i];
	}
	avarage=(float)sum/10;
	System.out.println("The Avarage of 10 numbers=:"+avarage);
} 
}