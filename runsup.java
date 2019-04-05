import java.io.*;
class RunUpAndDown {
    void ruab(double seq[], double n, double critival) {
    double count = 1;                           // total runs
	int i = 0;
    f:
    while (i< n - 1) {
		int j = 0;
        while (seq[i] <seq[i + 1]) {i++; j++;  if (i == n - 1) {   break f;  }  }
            if (j > 0) {
                count++;
            }
            while (seq[i] >seq[i + 1]) { i++;  if (i == n - 1) {  break f;  } }
            count++;
        }
        //System.out.println("Count is : " + count);
        double mean = ((2 * n) - 1) / 3.0;                      //formulea for mean
        double varsq = ((16 * n) - 29) / 90;                    //formulea for variance
        double var = Math.sqrt(varsq);                    // square root of variance
        double rup = (count - mean) / var;
System.out.println(rup);
        if (critival>rup&&rup> -critival) {
System.out.println("Randomness of given numbers accepted");
        } else {
System.out.println("Randomness of given numbers rejected");
        }
    }
}
public class runsup
 {
    public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter total number in sequence : ");
int n = Integer.parseInt(br.readLine());
        double seq[] = new double[n];
System.out.println("Enter numbers in sequences : ");
        for (int i = 0; i< n; i++) {
seq[i] = Double.parseDouble(br.readLine());
        }
        double p = (double) n;
System.out.println("Enter Critical Value : ");
        double cv = Double.parseDouble(br.readLine());
RunUpAndDown r = new RunUpAndDown();
r.ruab(seq, p, cv);
    }
}

