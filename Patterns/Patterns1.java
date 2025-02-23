class Patterns1
{
	public static void main(String[]args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		int num=1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		char ch='a';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
