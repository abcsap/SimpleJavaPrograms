import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class lcg {

	  public static int[] computeX(int l, int n) {
		 int min = (int) Math.pow(2, (l-1));
		 int max = (int) Math.pow(2, l);
		 Random rand = new Random();
		
		 int m = rand.nextInt((min+1)) + max;	
		 int a = rand.nextInt(m);
		 int b = rand.nextInt(m);
		 int x = rand.nextInt(m);
		 int[] array = new int[n+1];
		 System.out.print("x values: ");
		 for (int i = 0; i < n+1; i ++) {
			 x = (a * x + b) % m; // LCG formula
			 System.out.println(x);
			 array[i] = x;
		 }
		 return array;
	 }
		public static void main (String[] args) {
	  	 Scanner scanner = new Scanner(System.in);
	    	 System.out.print( "Input positive integer l: " );
	         int l = scanner.nextInt();
	         System.out.print( "Input positive integer n: " );
	         int n = scanner.nextInt();
		 int[] array = computeX(l,n);
     	} 
     	
}
