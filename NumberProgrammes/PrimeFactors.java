import java.util.Scanner;
class PrimeFactors
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int temp=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				System.out.println(i+ " ");
			}
			boolean flag=true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				temp =i;
				break;
			}
			System.out.println(temp);
		}
	}
}