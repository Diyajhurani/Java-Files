import java.util.Scanner;
class EmirpNo
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int dup=num;
		int rev=0;
		boolean flag=true;
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag=false;
				break;
			}
		}
		for (int i =num;i>2 ;i/=10 )
		{
			rev=rev*10+(i%10);
			if (rev%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag)
		{
			System.out.println(dup+ " is a emirp number");
		}
		else
			System.out.println(dup+ " is not a emirp number" );
	}
}