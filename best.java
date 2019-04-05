import java.io.*;
class best
{
public static void main(String args[])throws IOException
{
int flag[]=new int[10];
int sm[]=new int[10];
int i,sr,nm;
int sp,loc=0;
int cntrl=1000;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the no of memory segments\n");
nm=Integer.parseInt(in.readLine());
System.out.println("Enter the size of memory segments\n");

for(i=0;i<nm;i++)
sm[i]=Integer.parseInt(in.readLine());
for(i=0;i<nm;i++)
 flag[i]=0;
System.out.println("Before best fit allocation\n");
System.out.println("\nIndex\t\tMemory Segments\n");
for(i=0;i<nm;i++)
 System.out.println((i+1)+"\t\t"+sm[i]);
System.out.println("\nEnter the space requirement for new process\n");
sr=Integer.parseInt(in.readLine());
for(i=0;i<nm;i++)
{
if(flag[i]==0)
{
sp=sm[i];
if(sr<=sp)
{
if(cntrl>sp)
{
cntrl=sp;
loc=i;
}
}
}
}
if(cntrl==0)
System.out.println("\n Space not available");
else
{
sm[loc]=sr;
flag[loc]=1;
}
System.out.println("\nAfter Bestfit Allocation\n");
System.out.println("Index \t\t Memory Segment\n");
for(i=0;i<nm;i++)
{
System.out.println((i+1)+"\t\t"+sm[i]);
}
System.out.println("\n The process allocated to the memory segments "+(loc+1));
}
}


/*
C:\Users\my\Desktop\sumita>javac best.java
C:\Users\my\Desktop\sumita>java best
Enter the no of memory segments

5
Enter the size of memory segments

2
4
6
8
16
Before best fit allocation


Index           Memory Segments

1               2
2               4
3               6
4               8
5               16

Enter the space requirement for new process

5

After Bestfit Allocation

Index            Memory Segment

1               2
2               4
3               5
4               8
5               16

 The process allocated to the memory segments 3
*/