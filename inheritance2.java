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

class C extends A
{
	void same(){
	System.out.println("This is C");
	}
}

class hei{
	public static void main (String[] args)
	{
	C c=new C();
	B b=new B();
	c.rame();
	c.same();
	b.name();
	b.rame();
	}
}
