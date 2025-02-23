import java.util.Scanner;
class TechNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int len=0;
		int div=1;
		for (int i =num;i>0 ;i/=10 )
		{
			len++;
		}
		if (len%2==0)
		{
			for (int i=1;i<=(len/2) ;i++ )
			{
				div*=10;
			}
			int sum=(num/div)+(num%div);
			int sqr=sum*sum;
			System.out.println(sqr==num?num+" is a TECH number": num+" is not a TECH NUMBER" );
		}
		else
			System.out.println(num+ " is not a TECH number" );
	}
}