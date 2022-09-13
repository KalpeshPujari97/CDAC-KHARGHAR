import java.util.Scanner;

class A1_5 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		
			if(a>0){
			
				System.out.println("The entered Number is Positive");
			}
			
			else if (a==0){
				System.out.println("The entered Number is Zero");
			}
			
			else{
				System.out.println("The entered Number is Negative");
			}
		
		
	
	}

}