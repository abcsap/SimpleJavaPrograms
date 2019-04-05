import java.util.*;

class StringExp
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String s=new String();
System.out.println("Enter the string\n");
s=sc.nextLine();
char ch[ ]=new char[s.length()];
String temp=new String();



ch[0]=(char)(s.charAt(0)-32);


for(int i=1;i<s.length();i++) 
{
if(s.charAt(i-1)==' ')  
{

ch[i]=(char)(s.charAt(i)-32);
}
else
{
	ch[i]=s.charAt(i);

}

}

s=new String(ch);
System.out.println("Answer:"+s+".");
}

}

/*             
C:\Users\my\Desktop\sumita>javac StringExp.java

C:\Users\my\Desktop\sumita>java StringExp
Enter the string

hi hello welcome
ans
Hi Hello Welcome

C:\Users\my\Desktop\sumita>*/