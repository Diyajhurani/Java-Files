import java.util.Scanner;
class PallindromeNum
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int rev=0;

		for (int i=num;i>0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		if (rev==num)
		{
			System.out.println("Number is pallindrome");
		}
		else
			System.out.println("Number is not a pallindrome");
	}
}