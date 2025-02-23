class FascinatingNumber
{
	public static void main(String[]args)
	{
		int  num=327;
		String str=num+""+(num*2)+(num*3);
		boolean flag=true;
		//loop which starts from 1 to 9 characters
		for (char i='1';i<='9' ;i++ )
		{
			int cnt=0; //inti char =0 for every new char
			// fetch char from string one by one from 0 index
			for (int j=0;j<str.length() ;j++ )
			{
				char ch=str.charAt(j);// char fetched is store in var ch
				if (ch==i)//if i char matches with ch char if executes
				{
					cnt++;//increase the count if cnd satisfy
				}
			}
			if (cnt!=1)//if cnt of char is not equal to 1 then if executes
			{
				flag=false;//re inti the flag if cnt is not equals to
				break;//terminate the loop/
			}
		}
		if (flag)
		{
			System.out.println(num+" is fascinating number");
		}
		else
			System.out.println(num+" is not a fascinating number");
	}
}
