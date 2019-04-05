//searching an element..
import java.util.*;

class Sort3
{
	public static void main(String args[])
	{
		int i,j,temp,n ,x=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter how many elemnts:");
		n=in.nextInt();
		int a[]=new int [n];
		System.out.println("enter ele:");
				
		for(i=0;i<n;i++)
		a[i]=in.nextInt();
		System.out.println("enter ele to be searched:");
		int e=in.nextInt();
		
		for(i=0;i<n;i++)
		{
				if(a[i]==e)
				{
					System.out.println("element found at "+(i+1)+" position");
					 x=1;
				}
		
		}
		if(x==0)
			System.out.println("element not found");
	}
}		
		
			
			