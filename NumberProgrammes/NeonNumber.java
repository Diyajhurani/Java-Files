import java.util.Scanner;
class NeonNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sqr=(num*num);
		int sum=0;

		for (int i=sqr;i>0 ;i/=10 )
		{
			int rem=i%10;
			sum+=rem;
		}
		if (sum==num)
		{
			System.out.println(num+" is neon number");
		}
		else
			System.out.println(num+" is not neon number" );
	}
}





//fascinating number(with string)
//Fascinating number (without string)
//Automorphic number
//neon number
//buzz number
//duck number
//spy number
//peterson number
//sunny number