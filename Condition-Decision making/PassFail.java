import java.util.Scanner;
class PassFail
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your marks:");
		int marks=sc.nextInt();
		final int total=600;
		float percent=(marks*100)/total;
		String result=(percent>=75)?("A grade"):((percent>=60)?("B grade"):((percent>=35)?("C grade"):("Fail")));
		System.out.println(result);
	}
}