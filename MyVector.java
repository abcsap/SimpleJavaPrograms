import java.util.*;
class MyVector
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of students");
		int n=sc.nextInt();
		System.out.println("Enter Roll no. Name, Age in one line");
		String fake=sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+i+" line");
			String s1=sc.nextLine();
			v.addElement(new String(s1));	
		}

		System.out.println("Entered data: \n"+v);
	}
}
/*
output:



C:\Users\my\Desktop\sumita>java MyVector
Enter no. of students
3
Enter Roll no. Name, Age in one line
Enter 0 line 12 sumi 19
Enter 1 line 11 sumita 20
Enter 2 line12 guddu 20
Entered data:
[ 12 sumi 19,  11 sumita 20, 12 guddu 20]

*/