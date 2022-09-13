import java.util.Scanner;

class A1_17 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int original_num = num;
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse of the Number is : "+rev);
		
		if(original_num==rev)
		{
			System.out.println("This is a Palindrome Number ");
		}	
		else
		{
			System.out.println("This is Not a Palindrome Number ");
		}
	}
}