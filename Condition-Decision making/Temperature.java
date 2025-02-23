import java.util.Scanner;
class Temperature
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temprature in degree: ");
		float temp=sc.nextFloat();
		System.out.println("1.Fahrenite");
		System.out.println("2.Celsius");
		System.out.println("3.Rankine");
		System.out.print("Select the option: ");
		int opt=sc.nextInt();
		switch (opt)
		{
		    case 1:{
			System.out.println("   Fahrenite   ");
			System.out.println((9.0/5)*temp+32);
			break;
			}
			case 2:{
				System.out.println("   Celsius   ");
				System.out.println(temp+273.15);
				break;
			}
			case 3:{
				System.out.println("   Rankine   ");
				System.out.println((temp*(9.0/5)+491.67));
				break;
			}
		}
	}
}


