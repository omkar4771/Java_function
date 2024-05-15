package function;

import java.util.Scanner;

public class method3_multitable 
{
		static void multitable(int n)
		{
			int f1=1,i=1,f;
			
			while(i<=10)
			{
				f=i;
				f1=i*n;
				i++;
				System.out.println(f+" * "+n+"="+f1);
			}
		}
		public static void main(String args[])
		{
			int n;
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the number =");
			n=sc.nextInt();
			multitable(n);		
	}
}
