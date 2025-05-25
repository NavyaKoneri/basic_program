import java.util.Scanner;
class Char_check
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabets");
		char ch=sc.next().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
          System.out.println("It is a Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
		  System.out.println("It is a digit");
		}
		else
		{
		  System.out.println("It is a symbol");
		}
		
	}
}
