import java.util.Scanner;
class Game
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int rNum=0; // store a random number btw 1 to 3
		for (; ; )
		{
			//math.random() gen a double value from 0.00
			//we multiply the same value by 10
			//and then to get an integer we used typecasting

			int num=(int)(Math.random()*10);
			if(num>=1&&num<=3) //to check if the digit is btw 1 to 3
			{
				rNum=num; //if the cond is true then only store the value
				break; //if digit found btw 1 to 3 terminate the loop
			}
		}
		//whatever random value is gen we need to map it with the option
		String codeOpt=null;
		if (rNum==1)
		{
			codeOpt="STONE";
		}
		else if(rNum==2)
		{
			codeOpt="PAPER";
		}
		else if(rNum==3)
		{
			codeOpt="SCISSOR";
		}

		System.out.println();
		System.out.println("  WELCOME ");
		System.out.println();
		System.out.println("1.STONE  2.PAPER  3.SCISSOR");
		System.out.print("Enter option : "); //ask the user to enter an option
		int opt=sc.nextInt();
		String userOpt=null;
		if(opt==1)
		{
			userOpt="STONE";
		}
		else if (opt==2)
		{
			userOpt="PAPER";
		}
		else if (opt==3)
		{
			userOpt="SCISSOR";
		}
		else
		{
			System.out.println("INVALID INPUT");
			return;//if invalid opt ter the execution
		}

		System.out.println("User : "+userOpt+" Bot :"+codeOpt);
		if((opt==1 && rNum==3)||(opt==2 && rNum==1)||(opt==3 && rNum==2))
		{
			System.out.println("USER WINS");
		}
		else if ((opt==1 && rNum==2)||(opt==2 && rNum==3)||(opt==3 && rNum==1))
		{
			System.out.println("BOT WINS");
		}
		else
		{
			System.out.println("DRAW");
		}
	}
}



