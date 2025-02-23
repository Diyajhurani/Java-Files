import java.util.Scanner;
class DuckNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str=sc.next();
		boolean flag=true;
		int zero=0;
		if (str.charAt(0)=='0')
		{
			flag=false;
		}
		for (int i=0;i<str.length() ;i++ )
		{
			if (str.charAt(i)=='0')
			{
				zero++;
				break;
			}
		}
		if (zero!=1)
		{
			flag=false;
		}
		if (flag)
		{
			System.out.println("duck number");
		}
		else
			System.out.println("not a duck number");
	}
}
