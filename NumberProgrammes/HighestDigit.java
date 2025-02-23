import java.util.Scanner;
class HighestSmallestDigit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int max=0;
		int min=9;
		for (int i=num;i>0 ;i/=10 )
		{
			int dgt=i%10;
			if (max<dgt)
			{
				max=dgt;
			}
		}
		for (int i=num;i>0 ;i/=10 )
		{
			int dgt=i%10;
			if (min>dgt)
			{
				min=dgt;
			}
		}
		System.out.println("Largest dgt from "+ num+" is "+max);
		System.out.println("Smallest dgt from "+ num+" is "+min);
	}
}