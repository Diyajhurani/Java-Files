import java.util.Scanner;
class SpyNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem=i%10;
			sum+=rem;
			product*=rem;
		}
		System.out.println("Sum is: "+sum+" Product is: "+product);
		if (sum==product)
		{
			System.out.println("Spy number");
		}
		else
			System.out.println("Not a spy number");
	}
}