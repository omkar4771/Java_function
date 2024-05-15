package function;
import java.util.*;
public class function_02 
{
	static String armstrong()
	{
		int n,n1,f1=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number = ");
		n=sc.nextInt();
		int p=n;
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			
			f1=f1+n1*n1*n1;
		}
		if(p==f1)
		{
			return ("Armstrong..");
		}
		else
		{
		    return "Not Arnstrong..";
		}
		}
	static String magic()
	{	

		int n,sum=0,n1,sum1=0,a2;
		System.out.println("Enter the number = ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			sum=sum+n1;
		}
		int a=sum;
		while(a>0)
		{
			n1=a%10;
			a=a/10;
			sum1=sum1+n1;
		}
		if(sum1==1)
		{
		return "the number is magic number ";
		}
		else
		{
			return("The number is not magic number...");
		}
	}
	static String perfect()
	{
		int n,n1,sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number...");
		n=sc.nextInt();
		int i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			return "perfect number ";	
		}
		else
		{
			return "not perfect";
		}
	}
	public static void main(String[] args) 
	{
		String b1 = armstrong();
		System.out.println(""+b1);
		String b3=magic();
		System.out.println(" "+b3);
		String b4 = perfect();
		System.out.println(" "+b4);
		

	}

}
