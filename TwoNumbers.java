import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Sumapp extends Applet implements ActionListener 
{  
	public Sumapp() 
	{    
		TextField t1 = new TextField(15); 
		TextField t2 = new TextField(15); 
		TextField resultNum = new TextField(15); 
  
		secondNum.addActionListener(this);   
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

		resultNum.setText("Sum is " + (fn+sn)); 
	} 
}

/*<applet code="Sumapp.class" width="400" height="400"> </applet>*/ 