import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);

		System.out.print("Enter a string to be checked as palindrome or not:\n");
		String str=in.nextLine();
		int n=str.length();

		char a[]=new char[n];
		char rev[]=new char[n];
		a=str.toCharArray();	/*converted into character array*/
		
		for(int i=0;i<n;i++)
		{
			rev[n-1-i]=a[i];
		}
		
		String s1=new String(a);
		String s2=new String(rev);		
		
		if((s1.compareTo(s2)==0))
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
	}
}







/*OUTPUT


C:\Users\my\Desktop\sumita>javac Palindrome.java

C:\Users\my\Desktop\sumita>java Palindrome
Enter a string to be checked as palindrome or not:
helleh
palindrome

C:\Users\my\Desktop\sumita>java Palindrome
Enter a string to be checked as palindrome or not:
welcome
not palindrome

C:\Users\my\Desktop\sumita>
*/			