import java.util.Scanner;

class Assignment2_Pattern_Sheet1 {
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the pattern of n = ");
	int n = sc.nextInt();
	int A = 64;
	int add =1;
	
	System.out.println("Pattern problem sheet 1 : Q1");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q2");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print((char)(A+j)+" ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q3");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q4");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q5");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print((char)(A+i)+" ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q6");
	
	for(int i=1;i<=n;i++){
		for(int k=n;k>=i;k--){
			System.out.print("  ");
		}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q7");
	
	for(int i=1;i<=n;i++){
		for(int k=5;k>=i;k--){
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q8");
	
	for(int i=n;i>=1;i--){
		for(int k=1;k<=i;k++){
			System.out.print(" ");
		}
			for(int j=i;j<=n;j++){
				System.out.print(j+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q9");
	
	for(int i=1;i<=n;i++){
		for(int k=n;k>=i;k--){
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++){
				System.out.print((char)(A+j)+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q10");
	
	for(int i=n;i>=1;i--){
		for(int k=1;k<=i;k++){
			System.out.print(" ");
		}
			for(int j=i;j<=5;j++){
				System.out.print((char)(A+j)+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q11");
	
	for(int i=1;i<=n;i++){
		for(int k=n;k>=i;k--){
			System.out.print("  ");
		}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q12");
	
	for(int i=1;i<=n;i++){
		for(int k=n;k>=i;k--){
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q13");
	
	for(int i=1;i<=n;i++){
		for(int k=n;k>=i;k--){
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++){
				System.out.print((char)(A+i)+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q14");
	
	for(int i=n;i>=1;i--){
		/*for(int k=5;k>=i;k--){
			System.out.print(" ");
		}*/
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q15");
	
	for(int i=1;i<=n;i++){
		/*for(int k=5;k>=i;k--){
			System.out.print(" ");
		}*/
			for(int j=n;j>=i;j--){
				System.out.print(j+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q16");
	
	for(int i=n;i>=1;i--){
		/*for(int k=5;k>=i;k--){
			System.out.print(" ");
		}*/
			for(int j=n;j>=i;j--){
				System.out.print(j+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q17");
	
	for(int i=1;i<=n;i++){
		/*for(int k=5;k>=i;k--){
			System.out.print(" ");
		}*/
			
			for(int j=1;j<=i;j++){
			    
				System.out.print((add++)+" ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 1 : Q18");
	
	for(int i=n;i>=1;i--){
		/*for(int k=5;k>=i;k--){
			System.out.print(" ");
		}*/
			for(int j=1;j<=i;j++){
				System.out.print((char)(A+j)+" ");
			}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	}
	
	
}