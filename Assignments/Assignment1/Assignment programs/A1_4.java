import java.util.Scanner;

class A1_4 {

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two Numbers : ");
	System.out.print("a = ");
	
	int a = sc.nextInt();
	
	System.out.print("b = ");
	int b = sc.nextInt();
	
	int c = 0;
	
	c = a;
	a = b;
	b = c;
	
	System.out.println("Reverse of the entered two Numbers is : " +"\na = " +a+" \nb = "+b);
	
	}

}