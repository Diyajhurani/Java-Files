import java.util.Scanner;
class FactorialSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			int fact=1;
			for (int i=rem;i>=1 ;i-- )
			{
				fact*=i;//Formula to find factorial
			}
			sum+=fact;
			num/=10;
		}
		System.out.println("number: "+dup);
		System.out.println("sum of Factorial of a nunber is: "+sum);
	}
}