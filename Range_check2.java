class Range_check2 
{
	public static void main(String[] args) 
	{
		char ch='V';
		boolean lower_limit=(ch>='T');
		boolean upper_limit=(ch<='Z');
		boolean result=(lower_limit)&&(upper_limit);
		System.out.println(ch+" is in the range of T to Z : "+result);
	}
}
