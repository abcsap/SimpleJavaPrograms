import java.util.*;

class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, M;
      N = in.nextInt();
      M = in.nextInt();

      int A[] = new int[M];
      int B[] = new int[M];
      int C[] = new int[M];
      for(int i=0; i<M; i++){
         A[i] = in.nextInt();
         B[i] = in.nextInt();
         C[i] = in.nextInt();
      }
      
      int result1 = 0, result2 = 0;
       int j=1;
       while(j!=M)
       {    if(A[j]==1) { result1 = result1 + C[j]; break;}
             j++; 
       }
       int k[] = new int[M];
       int l=1;
       if(A[l]==1) 
       {    while(l!=M) 
                if(k[l]==(B[j]+1)) {result1 = result1 + C[l]; break;}
                l++;
       }
       result2= M-(1 + C[l]);
      System.out.println( result1 + " " + result2 );
      
   }
}
