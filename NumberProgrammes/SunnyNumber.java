import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int n=num+1;
		boolean flag=false;
		for (int i=1;i<=n ;i++ )
		{
			if (i*i==n)
			{
				flag=true;
				//System.out.println("Sunny number");
				break;
			}

		}
		if (flag)
			{
				System.out.println("Sunny number");
			}
			else
				System.out.println("not Sunny number");
	}
}