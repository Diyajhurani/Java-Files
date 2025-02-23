import java.util.Scanner;
class ReverseString
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.next();
		String rev=" ";
		//logic 1:
		//for (int i=0;i<name.length() ;i++ )
		//{
			//rev=name.charAt(i)+rev;
		//}
		//System.out.println(rev);

		//logic 2:
		for (int i=name.length()-1;i>=0 ;i-- )
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);

		//logic 3:
		//StringBuffer rev=new StringBuffer(name);
		//System.out.println(rev.reverse());




	}
}