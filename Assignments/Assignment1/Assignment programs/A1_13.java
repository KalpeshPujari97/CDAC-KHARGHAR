import java.util.Scanner;

class A1_13 {
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();//1234
		
		int rev = 0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;//  4321
			num = num/10; //1234/10=
		}
		System.out.println("Reversed Number : " +rev);
		
	
	}

}