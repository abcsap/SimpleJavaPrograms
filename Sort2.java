import java.io.*;
class Sort2
{
	public static void main(String args[])throws IOException
	{
		int i,j,temp,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter how many elemnts:");
		n=Integer.parseInt(br.readLine());
		int a[]=new int [n];
		System.out.println("enter ele:");
				
		for(i=0;i<n;i++)
		{ 
		a[i]=Integer.parseInt(br.readLine());
		}		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
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
output:


C:\Users\my\Desktop\sumita>java Sort2
enter how many elemnts:
6
enter ele:
2
9
10
9
8
5
sorted elements are:
10 9 9 8 5 2

*/		
		
			
			