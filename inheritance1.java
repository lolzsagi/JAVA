class A
{
	void rame(){
	System.out.println("This is A");
	}
}

class B extends A
{
	void name(){
	System.out.println("This is B");
	}
}

class C extends B
{
	void same(){
	System.out.println("This is C");
	}
}

class multilevel{
	public static void main (String[] args)
	{
	C c=new C();
	c.name();
	c.rame();
	c.same();
	}
}
