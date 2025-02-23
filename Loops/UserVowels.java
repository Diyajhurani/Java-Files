import java.util.Scanner;
class UserVowels
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name=sc.next();
		int len=name.length();
		for (int i=0; i<len;i++ )
		{
			if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='u')
			{
				System.out.print(name.charAt(i));
			}
		}
	}
}
