class IntConversion
{
	public static void main(String[]args)
	{
		int i=100;
		System.out.println("int value:"+i);
		long l=i;
		System.out.println("int to long:"+l);
		float f=i;
		System.out.println("int to float:"+f);
		double d=i;
		System.out.println("int to double:"+d);
		//lossy conversion
		//char c=i;
		//System.out.println("int to char:"+c);
	}
}