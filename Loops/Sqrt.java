import java.util.Scanner;
class Sqrt
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		//boolean flag = false;
		for (int i=1;i<=num ;i++ )
		{
			if (i*i==num)
			{
				//flag=true;
				System.out.println(i+ " is a perfect square root");
				break;
			}
			if (i*i>num)
			{
				System.out.println(num+" is not haiving a perfect square root");
				break;
				
			}
		}
	}
}