
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Range
{
    double lowerEnd, upperEnd;
    int observed, Oi_Ei;
    double Oi_Ei_Sqr, Oi_Ei_Sqr_by_Ei;
    public Range(double low, double up)
    {
        lowerEnd = low;
        upperEnd = up;
    }
}
public class Test_ChiSquare 
{
 Range[] range;
 int Expected, interval;
 ArrayList<Double> randomNumbers;
 double ziNot=0;
 public Test_ChiSquare()
    {
        randomNumbers = new ArrayList<Double>();
        acceptRandomNumbers();
        doSettings();
        doCounting();
        doCalculations();
        print();
    }
   public void acceptRandomNumbers()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Sample Space (N) = ");
            int count = Integer.parseInt(br.readLine());
           System.out.println("\nEnter Random Numbers: ");
           for(int i=0; i<count; i++)
            {
                randomNumbers.add(Double.parseDouble(br.readLine()));
            }
           System.out.print("Number of Intervals = ");
          interval = Integer.parseInt(br.readLine());
         doSettings();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
 public Test_ChiSquare(ArrayList<Double> randomNumbers, int interval) 
    {
        this.randomNumbers = randomNumbers;
        this.interval = interval;
        doSettings();
        doCounting();
        doCalculations();
        print();
    }
    private void doSettings()
    {
      range = new Range[interval];
     Expected = this.randomNumbers.size()/interval;
     double low=0;
     double up=1.0/interval;
     for(int i=0; i<range.length; i++)
        {
            range[i] = new Range(low, up);
            low=up;
            up=up+(1.0/interval);
        }  }
   private void doCounting()
    {
        for(int i=0; i<randomNumbers.size(); i++)
        {
            for(int j=0; j<range.length; j++)
            {
                if(randomNumbers.get(i)<range[j].upperEnd)
                {
                    range[j].observed++;
                    break;
                }
            }
        }
    }
   private void doCalculations()
    {
        for(int i=0; i<range.length; i++)
        {
           Range current = range[i];
           current.Oi_Ei = current.observed - Expected;
 
            current.Oi_Ei_Sqr = Math.pow(current.Oi_Ei, 2);
            current.Oi_Ei_Sqr_by_Ei = current.Oi_Ei_Sqr/Expected*1.0;
            ziNot+=current.Oi_Ei_Sqr_by_Ei;
        }
    }
   private void print()
    {
        System.out.println("Interval\t|" + "Oi\t|" + "Ei\t|" + "Oi-Ei\t|" + "(Oi-Ei)^2\t|" + "(Oi-Ei)^2/Ei");
        System.out.println("------------------------------------------------");
       for(int i=0; i<range.length; i++)
        {
            Range current = range[i];
            System.out.println("["+current.lowerEnd+"-"+current.upperEnd+")\t|"+ current.observed+"\t|"+Expected+"\t|"+current.Oi_Ei+"\t|"+current.Oi_Ei_Sqr+"\t\t|"+current.Oi_Ei_Sqr_by_Ei);
        }
            System.out.println("\nZiNot = " + ziNot);
    }

    public static void main(String[] args)
    {
    Test_ChiSquare obj = new Test_ChiSquare();  
    }   }
