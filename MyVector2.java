import java.util.*;
class MyVector2
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
		System.out.println("Enter info of student"+(i+1));
		String s1=sc.nextLine();
		v.addElement(s1);
		}
		System.out.println("Entered data is: \n"+v);
		System.out.println();		
		int ch=0;
		while(ch!=4)
		{
			System.out.println("1.insert,2.delete,3.display,4.exit");
			System.out.print("enter your opiton");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter Roll no. Name, Age in one line");
			System.out.println("Enter info of student ");
			String fake1=sc.nextLine();
			String s1=sc.nextLine();
			v.addElement(s1);
			break;
		
			case 2:
			System.out.println("enter the position of data to be deleted(consider position starting from o) :");
			
			n=sc.nextInt();
			v.removeElementAt(n);
			System.out.println("element removed ");
			break;

			case 3:
			System.out.println("Entered data:"+v);
	
			default : break;
			}
		}

	}
}