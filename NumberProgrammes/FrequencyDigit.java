import java.util.Scanner;
class FrequencyDigit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		long num=sc.nextLong();
		for (int i=0;i<=9 ;i++ )
		{
			int cnt=0;
			for (long j=num;j>0 ;j/=10 )
			{
				long rem=j%10;
				if (i==rem)
				{
					cnt++;
				}
			}
			if (cnt!=0)
			{
				System.out.println(i+" : "+cnt);
			}
		}
	}
}






























//even odd based on its length
//find the highest digit from a number
//find the smallest digit 
//otp generation(6 digit)
//frequency of digits in a num
//find the highest repeating digit in a num
//find the least repeating number





















