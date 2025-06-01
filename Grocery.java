import java.util.Scanner;
class  Grocery
{
	public static void main(String[] args) 
	{
		int amount=2000;
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Welcome to the Grocery Shop*****");
        System.out.println("Available grocery items are :");
		System.out.println("1.Floor \n2.Dal \n3.Soya beans \n4.Rice ");
		System.out.println("please select the above option :");
		int option=sc.nextInt();
	    switch(option)
	    {
		  case 1:
		  {
			System.out.println("1kg of floor 50 Rs ");
	        amount=amount-50;
			System.out.println("Available balance is : "+amount);
		  }break;
		  case 2:
		  { 
			System.out.println("1kg of dal 92 Rs ");
	        amount=amount-92;
			System.out.println("Available balance is : "+amount);
		  }break;
		  case 3:
		  {
			System.out.println("2kg of soya beans 80 Rs ");
	        amount=amount-80;
			System.out.println("Available balance is : "+amount);
		  }break;
		  case 4:
		  {
			System.out.println("10kg of Rice 500 Rs ");
	        amount=amount-500;
			System.out.println("Available balance is : "+amount);
		  }break;
		  default:
		  {
            System.out.println("please select the valid one ");
		  }
	}
}
}