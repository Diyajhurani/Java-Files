import java.util.Scanner;
class Month
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month:");
		String month=sc.next()//.toUpperCase();
		String op=((month.equals("oct"))||(month.equals("nov"))||(month.equals("dec"))||(month.equals("jan")))?("Winter"):
			((month.equals("feb"))||(month.equals("march"))||(month.equals("april"))||(month.equals("may")))?("Summer"):
			((month.equals("june"))||(month.equals("july"))||(month.equals("august"))||(month.equals("sept")))?("Monsoon"):("Invalid");
		System.out.println(op);
	}
}

