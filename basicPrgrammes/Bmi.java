import java.util.Scanner;
class Bmi
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter weights in pounds: ");
		float weight=sc.nextFloat();
		System.out.print("Enter height in inches:" );
		float height=sc.nextFloat();
		float weightTotal=(weight*0.45359237f);
		float heightTotal=(height*0.0254f);
		float Bmi=(weightTotal)/(heightTotal*heightTotal);
		System.out.println("BMI is "+Bmi);
	}
}