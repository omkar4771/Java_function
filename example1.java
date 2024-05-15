package function;
import java.util.*;


public class example1 
{
	static int Omkar(int n)
	{
		int a;
		a=n*n;
		return(a);
	}
	public static void main(String[] args) 
	{
		int n,s1;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		
		 s1=Omkar(n);
		 System.out.println(" "+s1);
	}

}
