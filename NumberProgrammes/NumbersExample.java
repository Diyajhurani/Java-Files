import java.util.Scanner;
class NumbersExample
{
	public static void main(String[]args)
	{
		System.out.print("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("sum: "+sum);
		System.out.println("number: "+dup);
	}
}