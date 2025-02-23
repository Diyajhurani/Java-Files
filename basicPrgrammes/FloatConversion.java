class FloatConversion
{
	public static void main(String[]args)
	{
		float f=22/7;
		System.out.println("float value:"+f);
		double d=f;
		System.out.println("float to double:"+d);
		//lossy conversion
		//char c=f;
		//System.out.println("float to char:"+c);
	}
}