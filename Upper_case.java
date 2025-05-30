class Upper_case 
{
	public static void main(String[] args) 
	{  
		char ch='L';
		String result=(ch>='A'&&ch<='Z')?" given character "+ch+" is upper case ":"given character "+ch+" is not upper case ";
		System.out.println(result);
	}
}
