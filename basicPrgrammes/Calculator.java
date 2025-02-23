import java.util.Scanner;
class Calculator
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num1: ");
		double num1=sc.nextDouble();
		System.out.print("Enter the num2: ");
		double num2=sc.nextDouble();
		System.out.print("Enter the operator: ");
		char op=sc.next().charAt(0);
		double opt=0;
		opt=(op=='+')?(num1+num2):
			(op=='-')?(num1-num2):
			(op=='*')?(num1*num2):
			(op=='/')?(num1/num2):
			(op=='%')?(num1%num2):(0.00001F);
		String output = (num1 + " "+op+" "+num2+" = "+opt);
		if(!(opt==0.00001f))
		{
			System.out.println(output);
		}
	}
}
