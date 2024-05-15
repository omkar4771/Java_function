package function;
import java.util.*;
public class function_01 
{
	static void areaofcircle()
	{
		double a,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle...");
		r=sc.nextInt();
		a=3.14*r*r;
		System.out.println("Area = "+a);
	}
	static void even()
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 number");
		n=sc.nextInt();
	for(i=2;i<=n;i=i+2)
	{
	System.out.print("  "+i);
	}
		
	}
	
		static void factor()
		{
			int a,i;
			System.out.println("Enter the number for factor..");
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			
			for(i=1;i<=(a/2);i++)
			{
				if(a%i==0)
				{
					System.out.println("  "+i);
				}
			}		
		}
	
	public static void main(String[] args) 
	{
		areaofcircle();
		even();
		factor();
	}

}
