class Census
{
	public static void main(String[]args)
	{
		long curPop=312032486;
		System.out.println("The current population is:"+curPop);
		long seconds=(365*24*60*60)*5;
		long birth=seconds/7;
		long death=seconds/13;
		long immigrant=seconds/45;
		long total = (curPop+birth-death+immigrant);
		System.out.println("The population after 5 years is:"+total);
	}
}