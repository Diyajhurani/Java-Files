import java.util.Scanner;
class Celsius
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Degree in celsius:");
		double celsius=sc.nextDouble();
		double fah=(9.0/5)*celsius+32;
		System.out.print(celsius+"celsius is " +fah+ " fahrenheit");
	}
}