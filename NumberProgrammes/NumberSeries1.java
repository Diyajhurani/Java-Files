import java.util.Scanner;
class NumberSeries1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number: ");
		int snum=sc.nextInt();
		System.out.print("Enter the ending number: ");
		int ennum=sc.nextInt();
		for (int i=snum;i<=ennum ;i++ )
		{
			int pow=1;
			int p=i%2==0?2:3;
			for (int j=1;j<=p ;j++ )
			{
				pow*=i;
			}
			System.out.print(pow+" ");
		}
	}
}


//10,13,68,130,222
//79,108,139,176,217,260
//1,3,9,33,153,873
//find all the prime numbers btw user entered range
//find count of good primes
//0,1,1,2,3,5,8,13(Fibonacci series)
