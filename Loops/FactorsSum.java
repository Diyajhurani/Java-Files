import java.util.Scanner;
class FactorsSum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int cnt=0;
		int sum=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				cnt++;
				System.out.print("Factors: "+i+" ");
				sum+=i;
			}	
		}
		System.out.println("count: "+cnt);
		System.out.println("sum: "+sum);
	}
}