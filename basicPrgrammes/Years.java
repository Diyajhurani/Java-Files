import java.util.Scanner;
class Years
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of minutes:");
		int minutes=sc.nextInt();
		int years=(365*24*60);
		int totalyear=(minutes/years);
		int days=(minutes-(totalyear*years))/(24*60);
		System.out.print(minutes +" minutes is approximately "+totalyear+" years and "+days+" days");
	}
}