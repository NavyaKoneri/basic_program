import java.util.Scanner;
class Calculator 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
		int result=0;
		System.out.println("Enter the Number : ");
		int n1=sc.nextInt();
		System.out.println("Enter the Number : ");
		int n2=sc.nextInt();
		System.out.println("Select the Suitable option To Perform :");
		int option=sc.nextInt();
		switch (option)
		{
			case 1:
			{
				result=add(n1,n2);
			}break;
			case 2:
			{
				result=sub(n1,n2);
			}break;
			case 3:
			{
				result=mul(n1,n2);
			}break;
			case 4:
			{
				result=div(n1,n2);
			}break;
			default :
			{
				System.out.println("Invalid Option");
			}
		}
		System.out.println("Result is : "+result);
	}
	public static int add(int a,int b)
	{
		
		int sum=a+b;
		return sum;
	}						  
	public static int sub(int a,int b)	   
	{						   
	   
		int sub=a-b;
		return sub;

	}						   
	public static int mul(int a,int b)	   
	{
		int mul=a*b;
		return mul;
	}						  
	public static int div(int a,int b)   
	{						   
		
		
		int div=a/b;
		return div;
	}
}