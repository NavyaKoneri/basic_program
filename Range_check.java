class Range_check 
{
	public static void main(String[] args) 
	{
		int a=75;
		boolean lower_limit=(a>=10);
		boolean upper_limit=(a<=50);
		boolean result=(lower_limit)&&(upper_limit);
		System.out.println(a+ " is in the range of 10-50 : " +result);
	}
}
