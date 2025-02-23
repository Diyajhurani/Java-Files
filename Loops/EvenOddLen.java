import java.util.Scanner;
class EvenOddLen
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int cnt=0;
		int dup=num;
		while (num>0)
		{
			cnt++;
			num/=10;
		}
		String newNum="";
		if (cnt%2==0)
		{
			for (int i=dup;i>0 ;i/=10 )
			{
				int rem=i%10;
				if (rem%2!=0)
				{
					newNum=++rem+newNum;
				}
				else
				{
					newNum=rem+newNum;
				}
			}
		}
		else
		{
			for (int i=dup;i>0 ;i/=10 )
			{
				int rem=i%10;
				if (rem%2==0)
				{
					newNum=++rem+newNum;
				}
				else
				{
					newNum=rem+newNum;
				}
			}
	
	}
	System.out.println(dup+ " : "+newNum);

}

}