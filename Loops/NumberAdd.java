import java.util.Scanner;
class NumberAdd
{
	public static void main(String[]args)
	{
		System.out.print("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
		int Evensum=0;
		while (num>0)
		{
			int rem=num%10;
			//Evensum+=rem;
			//num/=10;
			if (rem%2==0)
			{
				Evensum+=rem;
			}
			num/=10;
		}
		System.out.print(Evensum);

	}
}
