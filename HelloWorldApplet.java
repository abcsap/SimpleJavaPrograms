import java.awt.*; 
import java.applet.*; 
/* <APPLET CODE="HelloWorldApplet" WIDTH=100 HEIGHT=40> 
</APPLET>*/ public class HelloWorldApplet extends Applet 
{   
	public void paint(Graphics g)   
	{       
	g.setColor(Color.red);     
	g.drawString("NAME:XYZ",100,90);     
	g.setColor(Color.blue);     
	g.drawString("ROLL NO: 03",50,50);     
	setBackground(Color.green);   	
	} 
}