import java.util.Scanner;

class A1_14 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a = sc.nextInt(); //10
		int b = sc.nextInt();  //15
		
		int gcd=1;
		System.out.print("The common factors of a and b are : ");
		for(int i=1;i<=a/2&&i<=b/2;i++)  //a/2 bcz max factor of any number is half eg. max factor of 100 is 50.
		{
			if(a%i==0&&b%i==0){
		
				gcd = i;
				System.out.print(gcd+" ");
				
			}
			
		}
		System.out.println();
		System.out.println("The gcd of a and b is "+gcd);
	}


}