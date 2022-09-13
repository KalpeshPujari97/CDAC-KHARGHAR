import java.util.Scanner;

class A1_6 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int y = sc.nextInt();
		
		float a= y%4 ; 
		float b= y%400;
		
		if(a==0||b==0){
			
			System.out.println("The entered Year is Leap Year");
		}
			
		else {
		
			System.out.println("The entered Year is Leap Year");
		}
	
	}

}