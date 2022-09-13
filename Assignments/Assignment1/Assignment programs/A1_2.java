import java.util.*;
class A1_2{
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		int i=1 , f=1;
		
		while(i<=a){
			f = f*i;
			i = i+1;
			
		}
		
		System.out.println("The factorial of number is " + f);
	
	}

}