import java.util.Scanner;
class Evm
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int bjp=0 , cng=0 , ss=0 , aap=0 , mns=0 , nota=0;
		System.out.println();
		System.out.println("     WELCOME");
		System.out.println();
		System.out.println("Enter the population: ");
		int population=sc.nextInt();

		for (int i=1;i<=population ; i++ )
		{
			System.out.println();
			System.out.println("*** LIST OF PARTIES ***");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.println("ENTER THE OPTION : ");
			int opt=sc.nextInt();

			if (opt>=1 && opt<=6)
			{
				if (opt==1)
				{
					bjp++;
					System.out.println("Ache din aayege");

				}
				if (opt==2)
				{
					cng++;
					System.out.println("Bharat Todo");
				}
				if (opt==3)
				{
					ss++;
					System.out.println("Hum hai asli sena");
				}
				if (opt==4)
				{
					aap++;
					System.out.println("Mujhe azad karo");
				}
				if (opt==5)
				{
					mns++;
					System.out.println("Jai Maharastra");
				}
				if (opt==6);
				{
					nota++;
					System.out.println("You are educated");
				}
			if (!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("INVALID OPTION");
			}
			}
			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP has won the election by "+bjp+" votes");
				return;
			}
			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP has won the election by "+bjp+" votes");
			}
			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP has won the election by "+bjp+" votes");
			}
			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP has won the election by "+bjp+" votes");
			}
			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP has won the election by "+bjp+" votes");
			}

		}
