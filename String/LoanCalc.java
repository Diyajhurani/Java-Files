import java.util.Scanner;
class LoanCalc
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("   LOAN CALCULATOR");
		System.out.println();
		System.out.print("Enter the amount: ");
		float amount=sc.nextFloat();
		System.out.print("Enter the ROI: ");
		float roi=sc.nextFloat();
		System.out.print("Enter the tenure(months): ");
		int month=sc.nextInt();

		//conversion from months to years
		String str=(month/12)+"."+(month%12);
		float con=Float.parseFloat(str);

		System.out.println(); 
		System.out.println("LOAN CALCULATION");
		System.out.println("Principal amount :"+amount);
		System.out.println("ROI :"+roi+"%");
		System.out.println("Tenure :"+month+" months");
		
		float intYear=amount*roi/100;
		float totalInter=intYear*con;
		System.out.println("Interest : "+totalInter); 
		float outstanding=amount+totalInter;
		System.out.println("Total Oustanding Amount : "+(outstanding));
		System.out.println("Emi : "+(outstanding/month)+"rs");
	}
}
