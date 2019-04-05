import java.util.*;
class Factorial
{
	public static void main(String args[])
	{	
		int n,r,C,P;							
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values of n & r to find nCr:");		/*To find nCr*/
		n = in.nextInt();
		r = in.nextInt();
		C = fact(n)/(fact(r)*fact(n-r));
		System.out.println("nCr="+ C);
		System.out.println();

		System.out.println("Enter the values of n & r to find nPr:");		/*To find nPr*/      
		n = in.nextInt();
		r = in.nextInt();
		P = fact(n)/fact(n-r);
		System.out.println("nPr="+P);
	}

	static int fact(int n)				/*To find factorial of a number*/
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{	
			fact=fact*i;
		}
		return fact;
	}
}

/* output :

C:\Users\my\Desktop>javac Factorial.java

C:\Users\my\Desktop>java Factorial

Enter the values of n & r to find nCr:
8 5
nCr=56

Enter the values of n & r to find nPr:
8 5
nPr=6720

*/


