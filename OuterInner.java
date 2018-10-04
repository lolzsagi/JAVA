class OuterInner{
	class inner
	{
	void travel()
		{
	System.out.println("Singapore");
		}
	}
	public static void main(String[] args)
	{
	OuterInner book= new OuterInner();
	OuterInner.inner s= book.new inner();
	 s.travel();
	}
}
