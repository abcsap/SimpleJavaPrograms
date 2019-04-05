
public class HelloWorld{

     
	public static void main(String[] args)
	{
       
		int[] myarry = {1,2,3,4,5};
       
		doIt(myarry);
       
		for(int j=0; j<myarry.length; j++ )
               
			System.out.print(myarry[j] + "\t");
     
	}       
  
    

	public static void doIt(int[] z)
    
	{
        
		int[] a =z;
        
		a[0]=99;
        
		for(int i=0; i<a.length; i++)
        System.out.print(a[i]+ "\t");
    
	}

}



/* 99	2	3	4	5	99	2	3	4	5	*/