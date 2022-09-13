import java.util.Scanner;

class A1_9 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		//int factors = 0;
		System.out.print("Factors of the number are :");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0){
			System.out.print(" "+i);
			}
			
		}
		
		
			
		
		
	}


}