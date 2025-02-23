import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("   CURRENCY CONVERTOR  ");
		System.out.println();
		System.out.print("Enter the amount in (INR): ");
		float inr=sc.nextFloat();
		System.out.println();
		
		System.out.println("LIST OF CURENCIES:");
		System.out.println("1.USD");
		System.out.println("2.EURO");
		System.out.println("3.GBP");
		System.out.println("4.PKR");

		System.out.print("Enter the currency code:");
		String curr=sc.next();
		float conCurr=0;
		if (curr.equals("USD"))
		{
			conCurr=inr/86.56f;
			System.out.println(inr +" INR = "+conCurr+" USD ");
		}
		else if (curr.equals("EUR"))
		{
			conCurr=inr/90.25f;
			System.out.println(inr +" INR = "+conCurr+" EUR ");
		}
		else if (curr.equals("GBP"))
		{
			conCurr=inr/107.652f;
			System.out.println(inr +" INR = "+conCurr+" GBP ");
		}
		else if (curr.equals("PKR"))
		{
			conCurr=inr/0.3106f;
			System.out.println(inr +" INR = "+conCurr+" PKR ");
		}
		else
		{
			System.out.println("INVALID CURRENCY");
		}
	}
}









