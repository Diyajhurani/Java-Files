import java.util.Scanner;
class PrimeRange
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting point: ");
		int sPoint=sc.nextInt();
		System.out.print("Enter the Ending point: ");
		int ePoint=sc.nextInt();

		for (int i=sPoint+1;i<ePoint ;i++ )
		{
			//System.out.println(i);
			boolean flag=true;
			for (int j=2;j<i ;j++ )
			{
				//System.out.print(j);
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				System.out.println("PRIME NUMBERS ARE: ");
				System.out.println(i);
			}
		}
	}
}
