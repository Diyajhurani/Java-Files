import java.util.Scanner;
class PoundsKg
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number in pounds:");
		float pounds=sc.nextFloat();
		float kg=(pounds*0454f)/1000;
		System.out.print(pounds+" is "+kg+" kilograms");
	}
}
