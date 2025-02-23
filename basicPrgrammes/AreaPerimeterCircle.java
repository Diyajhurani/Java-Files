import java.util.Scanner;
class AreaPerimeterCircle
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius of circle (in cm):");
		float radius=sc.nextFloat();
		final float pi=22/7;
		float perimeter=2*pi*radius;
		System.out.print("Perimeter of circle:"+perimeter);
	}
}