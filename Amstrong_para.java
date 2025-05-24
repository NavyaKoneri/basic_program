import java.util.Scanner;
class Amstrong_para 
{
	public static boolean Amstrong(int num) 
	{
		int n1=num;
		int n2=num;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		int sum=0;
		while(n1>0)
		{
			int rem=n1%10;
			int pro=1;
			for(int i=1;i<count;i++)
			{
				pro=pro*rem;
			}
			sum=sum+pro;
            n1=n1/10;
		}
		System.out.println("Sum "+sum); 
		return sum==n1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(Amstrong(num))
		{
			System.out.println(num+" is Amstrong number");
		}
		else
		{
			System.out.println(num+" is not Amstrong number");
		}
    }
}

