import java.util.*;
import java.io.*;
class MyException extends Exception
{
	private int ans;
	public MyException(){
		int b;
		int d;
		ans=b*d;
	}
	public String toString(){
		return " The denominator is zero";
	}
}
public class Express
{
	public static void main(String args[]) throws Exception{
		int a,b,c,d,sum=0,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for a,b,c and d:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		ans=b*d;
		sum= ((a*d)+(b*c))/(b*d);
		
		if(ans==0)
			throw new MyException();
		else
			System.out.println("sum="+sum);
	}
	
}
			