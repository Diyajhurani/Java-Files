import java.util.Scanner;
class AlphaDigit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch=sc.next().charAt(0);

		String op=((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))?((ch>='a'&& ch<='z')?(ch+ " is a lowercase Alphabet"):(ch+" is an Uppercase Alphabet")):((ch>='0' && ch<='9')?(ch+ "is a digit"):(ch+ "is a special character"));
		System.out.println(op);
	}
}
