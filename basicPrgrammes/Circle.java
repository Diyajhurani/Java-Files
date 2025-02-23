import java.util.Scanner;
class Circle
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of Radius r:");
		float radius=sc.nextFloat();
		final float pi=22/7;
		float area=pi*(radius*radius);
		System.out.println("Area of circle is :"+area+"cm^2");
	}
}
	
