class Example2
{
	public static void main(String []args)
	{
		String str="SoftproIndia";
		
		System.out.println("The length= "+str.length());
		str=null;
		try
		{
		System.out.println("The length= "+str.length());
		}
		catch(NullPointerException nex)
		{
			System.out.println("You are try to find the length of null string");
		}
		System.out.println("All is well");
		
	}
}