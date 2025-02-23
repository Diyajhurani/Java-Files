import java.util.Scanner;
class Cylinder
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius and height of a cylinder:");
		float rad=sc.nextFloat();
		float height=sc.nextFloat();
		double area=3.14*(rad*rad);
		double volume=area*height;
		System.out.println("The area is:"+area);
		System.out.println("The volume is:"+volume);
	}
}
