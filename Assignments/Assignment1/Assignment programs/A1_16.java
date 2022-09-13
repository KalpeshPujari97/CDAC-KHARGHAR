import java.util.Scanner;

class A1_16 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	
		int factor1 = 0;
		int factor2 = 0;
		
		System.out.print("Prime Factors of the number1 are :");
		for(int i=2;i<num1;i++)
		{
			while(num1%i==0){
			System.out.print(" "+i);
			num1 = num1/i;
			}
			factor1=i;
		}
		if(num1>2){
			System.out.print(" "+num1);
			
		}
		
		
		System.out.println();
		
		
		System.out.print("Prime Factors of the number2 are :");
		for(int i=2;i<num2;i++)
		{
			while(num2%i==0){
			System.out.print(" "+i);
			num2 = num2/i;
			}
			
			factor2=i;
			
		}
		if(num2>2){
			System.out.print(" "+num2);
			
		}
		
		//int lcm = factor1*factor2*num1*num2;
		//System.out.print("lcm="+lcm);
		
	}


}