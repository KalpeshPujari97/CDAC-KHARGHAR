import java.util.Scanner;

class Assignment2_Pattern_Sheet3 {
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the pattern of n = ");
	int n = sc.nextInt();
	
	System.out.println("Pattern problem sheet 3 : Q1");
	
		for(int i=1; i<=n; i++)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	System.out.println("Pattern problem sheet 3 : Q2");
	
		for(int i=1; i<=n; i++)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	System.out.println("Pattern problem sheet 3 : Q3");
	
		for(int i=1; i<=n; i++)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print("* ");
			}
			System.out.println();
		}
	
	System.out.println("Pattern problem sheet 3 : Q4");
	
		for(int i=1; i<=n; i++)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print(j+" ");
			}
			for(int j=i-1; j>=1; j--)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	System.out.println("Pattern problem sheet 3 : Q5");
	
		for(int i=n; i>=1; i--)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print(j+" ");
			}
			for(int j=n-1; j>=i; j--)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	System.out.println("Pattern problem sheet 3 : Q6");
	
		for(int i=n; i>=1; i--)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print("* ");
			}
			System.out.println();
		}
	
	System.out.println("Pattern problem sheet 3 : Q7");

		for(int i=n; i>=1; i--)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				/*if(j==1||i==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");*/
				System.out.print(i+" ");
			}
			System.out.println();
		}


	}
	
}