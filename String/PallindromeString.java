import java.util.Scanner;
class PallindromeString
{
	public static void  main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=sc.next();
		String rev="";

		for (int i=str.length()-1;i>=0 ;i-- )
		{
			rev=rev+str.charAt(i);
		}
		if (str.equals(rev))
		{
			System.out.println("pallindrome");
		}
		else
			System.out.println("not pallindrome");
	}
}
