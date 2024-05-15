package function;

import java.util.Scanner;

public class demo
{

	public static void main(String[] args) 
	{
		int n,i,fact,sum=0,n1,sum1=0,a2;
		System.out.println("Enter the number = ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			//sum=sum+n1;
			
			for(i=1;i<=n1;i++)
			{
				fact=n1*i;
				sum=sum+fact;
			}
		}
		System.out.println("guihi "+sum);
	}
}

