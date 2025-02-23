class Swapping
{
	public static void main(String[] args)
	{
		int a=2;
		int b=4;
		System.out.println("Before Swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		int temp =a;
		a=b;
		b=temp;

		System.out.println("After Swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}

// without using 3rd variable
class Swapping
{
	public static void main(String[] args)
	{
		int a=2;
		int b=4;
		System.out.println("Before Swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After Swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}