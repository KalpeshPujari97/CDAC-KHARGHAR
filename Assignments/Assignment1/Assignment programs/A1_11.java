import java.util.Scanner;

class A1_11 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers a b and c : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b&&a<c){
		
			System.out.println("a is the smallest");
		}
		else if(b<a&&b<c){
		
			System.out.println("b is the smallest");
		}
		if(a==b && b==c){
		
			System.out.println("All are same numbers");
		}
		else{
		
			System.out.println("c is the smallest");
		}
		
	}

}