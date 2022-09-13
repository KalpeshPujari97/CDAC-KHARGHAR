import java.util.Scanner;

class Assignment2_Pattern_Sheet3 {
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the pattern of n = ");
	int n = sc.nextInt();
	
	System.out.println("Pattern problem sheet 2 : Q1");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q2");
	
	for(int i=1;i<=n;i++){
		for(int k=n-1;k>=i;k--){
			System.out.print("  ");
		}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q3");
	
	for(int i=1;i<=n;i++){
		for(int k=n-1;k>=i;k--){
			System.out.print("");
		}
			for(int j=n;j>=i;j--){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q4");
	
	for(int i=1;i<=n;i++){
		for(int k=1;k<=i-1;k++){
			System.out.print("  ");
		}
			for(int j=n;j>=i;j--){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q5");
	
	for(int i=1;i<=n;i++){
		for(int k=n-1;k>=i;k--){
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q6");
	
	for(int i=1;i<=n;i++){
		for(int k=1;k<=i-1;k++){
			System.out.print(" ");
		}
			for(int j=n;j>=i;j--){
				System.out.print("* ");
			}
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q7");
	
	for(int i=1;i<=n;i++){
		for(int k=n-1;k>=i;k--){
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
	}
	for(int i=1;i<=n;i++){
		for(int k=1;k<=i;k++){
			System.out.print(" ");
		}
			for(int j=n;j-1>=i;j--){
				System.out.print("* ");
			}
		
		System.out.println();
	}
	
	
	System.out.println("Pattern problem sheet 2 : Q8");
	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++){
		for(int k=n-1;k>=i;k--){
			System.out.print("");
		}
			for(int j=n;j-1>=i;j--){
				System.out.print("* ");
			}
	
		System.out.println();
	}
	
	System.out.println("Pattern problem sheet 2 : Q9");
	
	for(int i=1; i<=n; i++)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1; i>=1; i--)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("Pattern problem sheet 2 : Q10");
		
		for(int i=1; i<=n; i++)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("Pattern problem sheet 2 : Q11");
		
		for(int i=n; i>=1; i--)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern problem sheet 2 : Q12");
		
		for(int i=5; i>=1; i--)
		{
			for(int k=5; k>=i; k--)
			{
				System.out.print("");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++)
		{
			for(int k=5; k>=i; k--)
			{
				System.out.print("");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern problem sheet 2 : Q13");
		
		for(int i=5; i>=1; i--)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern problem sheet 2 : Q14");
		
		for(int i=5; i>=1; i--)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern problem sheet 2 : Q15");
		
		for(int i=1; i<=n; i++)
		{
			for(int k=5; k>=i; k--)
			{
				System.out.print("");
			}
			for(int j=1; j<=n; j++)
			{
				if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern problem sheet 2 : Q16");
		
		for(int i=1; i<=n; i++)
		{
			for(int k=5; k>i; k--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=n; j++)
			{
				if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}