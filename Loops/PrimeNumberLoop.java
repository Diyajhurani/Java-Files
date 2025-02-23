import java.util.Scanner;
class PrimeNumberLoop
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		boolean flag=true;
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag)
			{
				System.out.println("It is a prime number");
			}
			else
				System.out.println("Not a prime" );

		}
	}