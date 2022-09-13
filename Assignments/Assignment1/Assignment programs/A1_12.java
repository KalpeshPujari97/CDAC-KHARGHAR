import java.util.Scanner;

class A1_12 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int sum = 0;
		sum = a^b;
		
		int carry = (a&b)<<1;
		System.out.println("Addition of two numbers = "+ (sum+carry));
	}


}