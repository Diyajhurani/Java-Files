import java.util.Scanner;
class TwoFive
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		String op = (num%2==0 && num%5==0)?("HighTwo HighFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HighFive"):(" ")));
		System.out.println(op);
	}

}
