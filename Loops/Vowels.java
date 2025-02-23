im\\4
5\7port java.util.Scanner;
class Vowels
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the alphabet:");
		char ch=sc.next().charAt(0);
		String op=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?("Given aplhabet is vowel"):("Given alphabet is consonant");
		System.out.println(op);
	}
}