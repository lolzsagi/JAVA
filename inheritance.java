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

class single{
	public static void main (String[] args)
	{
	B b=new B();
	b.name();
	b.rame();
	}
}
