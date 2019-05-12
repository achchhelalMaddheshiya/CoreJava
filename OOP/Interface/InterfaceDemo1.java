interface interface1
{
	void m1();		// public abstract void m1();
	void m2();		// public abstract void m1();
	void m3();		// public abstract void m1();
}
class TestInterface1 implements interface1
{
	public void m1()
	{
		System.out.println("Implementation of m1");
	}
	public void m2()
	{
		System.out.println("Implementation of m2");
	}
	public void m3()
	{
		System.out.println("Implementation of m3");
	}
	public static void main(String [] args)
	{
		TestInterface1 tif=new TestInterface1();
		tif.m1();
		tif.m2();
		tif.m3();
	}
}