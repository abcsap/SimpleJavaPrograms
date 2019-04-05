import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Sumapp extends Applet implements ActionListener 
{  	
	

		TextField t1 = new TextField(20); 
		TextField t2 = new TextField(20);
		TextField resultNum = new TextField(20);  		
  		public Sumapp() 
		{    
		
			t2.addActionListener(this);   
			add(t1); 
			add(t2);  
			add(resultNum); 
		}
 
		public void actionPerformed(ActionEvent e) 
		{ 
			String str1 = t1.getText();
			String str2 = t2.getText(); 
			double fn = Double.parseDouble(str1); 
			double sn = Double.parseDouble(str2);   
			double sum = fn+sn;
			System.out.println("SUM:"+sum);
						
		} 
		public void paint(Graphics g)
		{
			g.drawString("enter two numbers:",10,10);
			/*g.drawString("sum:"+sum,50,10);*/
		}
		
}

/*<applet code="Sumapp.class" width="400" height="400"> </applet>*/ 