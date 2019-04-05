//package poker;

public class Poker {

    public static void main(String args[]) {
        // TODO code application logic here
         double[] ei=new double[3];
        double[] oe=new double[3];
        double n,sum=0,m=5.99;
        String b;
        String[] number=new String[15]; 
        int i;
        for(i=0;i<15;i++){
            n=Math.random();
 
            number[i]=String.valueOf(n);
            number[i]=String.format("%.3f",n);
			System.out.println(number[i]);
        }
        int[] oi=new int[3];
	char x,y,z;
        for(i=0;i<15;i++){
            x=number[i].charAt(2);
            y=number[i].charAt(3);
            z=number[i].charAt(4);
        if(x==y&&x==z){
            oi[0]++;
        }
        else if(x==y||x==z||y==z){
            oi[1]++;
            
        }
        else{
            oi[2]++;
        }
    }
		ei[0]=oi[0]*0.01;
        ei[1]=oi[1]*0.27;
		ei[2]=oi[2]*0.72;
		for(i=0;i<3;i++){
                    if(oi[i]==0){
                        oe[i]=0;
                    }else{
                        oe[i]=((oi[i]-ei[i])*(oi[i]-ei[i]))/ei[i];
                    }
        }
        sum=oe[0]+oe[1]+oe[2];
        b=String.format("%.2f",sum);
        System.out.println(b);
	System.out.println("Comparing with Zaplha(5.99):...");
		if(sum>m){
			System.out.println("rejected");
		}else{
			System.out.println("not rejected");
		}
    }
    
}
/*OUTPUT


Z:\>javac Poker.java

Z:\>java Poker
Z:\BE>java Poker
0.117
0.962
0.001
0.957
0.810
0.221
0.180
0.440
0.230
0.400
0.103
0.451
0.042
0.075
0.025
10.96
Comparing with Zaplha(5.99):...
rejected*/