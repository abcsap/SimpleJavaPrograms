import java.io.*;
class Lcm
{
	public static void main(String args[])throws IOException
	{
		int i,j,min,gcd=1,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 1st no:");
		i=Integer.parseInt(br.readLine());
		System.out.println("enter 2nd no:");
		j=Integer.parseInt(br.readLine());
		if(i<=0 ||j<=0)
			System.out.println("invalid data");
		else
		{
			if(i<j) min=i;
				min=j;
			for(n=1;n<=min;n++)
			if(i%n==0 && j%n==0)
				gcd=n;

			System.out.println("gcd of "+i+"and "+j+" = "+gcd);
			System.out.println("lcm of "+i+"and "+j+" = "+i*j/gcd);
		}
	}
}

/*output:


C:\Users\my\Desktop\sumita>javac Lcm.java

C:\Users\my\Desktop\sumita>java Lcm
enter 1st no:
12
enter 2nd no:
23
gcd of 12and 23 = 1
lcm of 12and 23 = 276

C:\Users\my\Desktop\sumita>*/