import java.util.Scanner;
class ReverseNumberLeetCode
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		long rev=0;
		boolean flag=false;
		if (num<0)
		{
			flag=true;
			num=Math.abs(num);
		}
		for (int i=num;i>0 ;i/=10 )
		{
			rev=rev*10+(i%10);
		}
		if (flag)
		{
			rev=rev*(-1);
		}
		if (rev>Integer.MAX_VALUE)
		{
			System.out.println(0);
		}
		else
			System.out.println(rev);
	}
}

		