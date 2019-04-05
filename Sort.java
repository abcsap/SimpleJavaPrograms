import java.util.*;
class Sort
{
	public static void main(String args[])
	{
		int i,j,temp,n;
		Scanner in=new Scanner(System.in);

		System.out.println("enter how many elemnts:");
		n=in.nextInt();

		int a[]=new int [n];

		System.out.println("enter ele:");
				
		for(i=0;i<n;i++)
		a[i]=in.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted elements are:");
		for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}		
		
			
/*
output

C:\Users\my\Desktop\sumita>javac Sort.java

C:\Users\my\Desktop\sumita>java Sort

enter how many elemnts:
5
enter ele:
4 5 9 10 2 1
sorted elements are:
2 4 5 9 10
*/			