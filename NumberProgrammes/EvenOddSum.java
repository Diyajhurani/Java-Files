class EvenOddSum
{
	public static void main(String [] args)
	{
		int num=7264;
		int even = 0;
		int odd =0;
		int rem=num%10;
		int temp=0;
		
		temp = (rem%2==0)?(even=even+rem):(odd=odd+rem);

		num=num/10;
		rem=num%10;
		temp = (rem%2==0)?(even=even+rem):(odd=odd+rem);

		num=num/10;
		rem=num%10;
		temp = (rem%2==0)?(even=even+rem):(odd=odd+rem);

		num=num/10;
		rem=num%10;
		temp = (rem%2==0)?(even=even+rem):(odd=odd+rem);

		System.out.println("even sum: "+even);
		System.out.println("odd sum: "+odd);
	}
}



