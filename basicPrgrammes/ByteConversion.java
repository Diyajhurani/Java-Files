class ByteConversion
{
	public static void main(String[]args)
	{
		byte b=10;
		System.out.println("byte value:"+b);
		short s=b;
		System.out.println("byte to short:"+s);
		int i=b;
		System.out.println("bytet to int:"+i);
		long l=b;
		System.out.println("byte to long:"+l);
		float f=b;
		System.out.println("byte to float:"+f);
		double d=b;
		System.out.println("byte to double:"+d);
		//lossy conversion
		//char c=b;
		//System.out.println("byte to char:"+c);
	}
}
