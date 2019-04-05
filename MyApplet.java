import java.awt.*;
 import java.applet.*;
 /* <APPLET CODE="MyApplet" WIDTH=100 HEIGHT=100> 
</APPLET>*/

 public class MyApplet extends Applet 
{   public void paint(Graphics g)   
	{       g.setColor(Color.red);   
  		g.drawString("NAME:XYZ",100,90);   
  		g.setColor(Color.blue);  
   		g.drawString("ROLL NO: 03",50,50);    
 		setBackground(Color.blue);  
 	}
}