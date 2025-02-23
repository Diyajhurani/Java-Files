class LongConversion
{
	public static void main(String[]args)
	{
		long l=8765432345l;
		System.out.println("long value:"+l);
		float f=l;
		System.out.println("long to float:"+f);
		double d=l;
		System.out.println("long to double:"+d);
		//lossy conversion
		//char c=l;
		//System.out.println("long to char:"+c);
	}
}