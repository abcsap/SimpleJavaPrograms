


/*executed*/

import java.util.*;
class Capitalize
{
	public static void main(String args[])
	{	String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		str=sc.nextLine();

		StringBuffer s1=new StringBuffer(str);
		char f=s1.charAt(0);
		s1.setCharAt(0,(char)(f-32));   /*for 1st alphabet*/
		
		for(int i=0;i<=s1.length()-2;i++)
		{
			char x=s1.charAt(i);
			char y=s1.charAt(i+1);

			if(x==' ' && y>='a' && y<='z')
			{
				s1.setCharAt(i+1,(char)(y-32));
			}
		}
	System.out.println(s1);
	}
}
		