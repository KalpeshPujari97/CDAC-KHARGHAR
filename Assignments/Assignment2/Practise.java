import java.util.Scanner;
import java.util.*;

class Practise {

	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Pattern for n = ");
	int n = sc.nextInt();
	
	int alpha=65; //ASCII value of A is 65 
	int k=1;
	
		
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++)
		{
			for(int j=i; j>=0; j--)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for(int i=n; i>=0; i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for(int i=n; i>=0; i--)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for(int i=n; i>=0; i--)
		{
			for(int j=i; j>=0; j--)
			{
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1||i==5||j==1||j==5)
	
				System.out.print("* ");
				
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==5||i==j||j==1)
	
				System.out.print("* ");
				
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print((k++)+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print((k++)%2+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(k=5;k>=i;k--){
				
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(j+"");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(k=5;k>=i;k--){
				
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		
	}

}