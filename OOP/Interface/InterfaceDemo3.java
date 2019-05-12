interface Interface3
{
	void m1();
	void m2();
}
class TestInterface implements Interface3
{
	public void m1()
	{
		System.out.println("Implementation of m1");
	}
	public void m2()
	{
		System.out.println("Implementation of m2");
	}
	public static void main(String [] args)
	{
		Interface3 it =new TestInterface();
		it.m1();
		it.m2();
	}
}