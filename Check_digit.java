class Check_digit 
{
	public static void main(String[] args) 
	{
		char ch='9';
		boolean lower_limit=(ch>='0');
		boolean upper_limit=(ch<='9');
		boolean result=(lower_limit)&&(upper_limit);
		System.out.println(ch+ " given character is a digit : "+result);
	}
}
