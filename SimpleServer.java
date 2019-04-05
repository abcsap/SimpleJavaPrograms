// SimpleServer.java: A simple server program.
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.io.*;
import java.awt.AWTException;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;
 
public class SimpleServer {
static int rightvar=0,leftvar=0;
public static void main(String args[]){
Thread t=new Thread(){
public void run(){
// Register service on port 1254
System.out.println("Listening...");
try{
 for (
    final Enumeration< NetworkInterface > interfaces =
        NetworkInterface.getNetworkInterfaces( );
    interfaces.hasMoreElements( );
)
{
    final NetworkInterface cur = interfaces.nextElement( );

    if ( cur.isLoopback( ) )
    {
        continue;
    }

  //  System.out.println( "interface " + cur.getName( ) );

    for ( final InterfaceAddress addr : cur.getInterfaceAddresses( ) )
    {
        final InetAddress inet_addr = addr.getAddress( );

        if ( !( inet_addr instanceof Inet4Address ) )
        {
            continue;
        }

        System.out.println(
            "  address: " + inet_addr.getHostAddress( ) +
            "/" + addr.getNetworkPrefixLength( )
        );

        System.out.println(
            "  broadcast address: " +
                addr.getBroadcast( ).getHostAddress( )
        );
    }
}
   }

catch(Exception e)
{
System.out.println("Problem in your LAN connection! "+e.toString());

}
try{
ServerSocket s = new ServerSocket(11000);
while(true){

Socket s1=s.accept(); // Wait and accept a connection
InputStream s1In = s1.getInputStream();
DataInputStream dis = new DataInputStream(s1In);

String st =dis.readUTF();

int foo = Integer.parseInt(st);

st=""+foo;

//System.out.println("Listening..."+st);


if(foo==9000)
mousekeys("9000");


if(foo==9111)
mousekeys("9111");

///mouse
if(foo>1999&&foo<3000)
{
if(foo==2000)
mousekeys("2000");
if(foo==2111)
mousekeys("2111");
if(foo==2100)
mousekeys("2100");
if(foo==2001)
mousekeys("2001");
if(foo==2222)
mousekeys("2222");
if(foo==2333)
mousekeys("2333");
if(foo==2322)
mousekeys("2322");
if(foo==2223)
mousekeys("2223");
}


if(foo==1000)
presskeys("pshift");

if(foo==1100)
presskeys("pent");

if(foo==1110)
presskeys("pctrl");

if(foo==1111)
presskeys("pspace");

if(foo==4){
{
leftvar++;
if(leftvar>5)
{
leftvar=0;
givedir("fleft");}
}
}
if(foo==6)
{
rightvar++;
if(rightvar>5)
{
rightvar=0;
givedir("fright");
}
}
//////////////////////////////////////
if(foo==44){
{
leftvar++;
if(leftvar>4)
{
leftvar=0;
givedir("fleft");}
}
}
if(foo==66)
{
rightvar++;
if(rightvar>4)
{
rightvar=0;
givedir("fright");
}
}
//////////////////////////////////////

if(foo==444){
{
leftvar++;
if(leftvar>3)
{
leftvar=0;
givedir("fleft");}
}
}
if(foo==666)
{
rightvar++;
if(rightvar>3)
{
rightvar=0;
givedir("fright");
}
}
//////////////////////////////////////
if(foo==4444){
{
leftvar++;
if(leftvar>2)
{
leftvar=0;
givedir("fleft");}
}
}
if(foo==6666)
{
rightvar++;
if(rightvar>2)
{
rightvar=0;
givedir("fright");
}
}
//////////////////////////////////////
if(foo==44444){
{
givedir("fleft");}
}
if(foo==66666)
{
givedir("fright");
}

//breaksss.....

if(foo==42){
{
leftvar++;
if(leftvar>5)
{
leftvar=0;
givedirb("fleft");}
}
}
if(foo==62)
{
rightvar++;
if(rightvar>5)
{
rightvar=0;
givedirb("fright");
}
}
//////////////////////////////////////
if(foo==442){
{
leftvar++;
if(leftvar>4)
{
leftvar=0;
givedirb("fleft");}
}
}
if(foo==662)
{
rightvar++;
if(rightvar>4)
{
rightvar=0;
givedirb("fright");
}
}
//////////////////////////////////////

if(foo==4442){
{
leftvar++;
if(leftvar>3)
{
leftvar=0;
givedirb("fleft");}
}
}
if(foo==6662)
{
rightvar++;
if(rightvar>3)
{
rightvar=0;
givedirb("fright");
}
}
//////////////////////////////////////
if(foo==44442){
{
leftvar++;
if(leftvar>2)
{
leftvar=0;
givedirb("fleft");}
}
}
if(foo==66662)
{
rightvar++;
if(rightvar>2)
{
rightvar=0;
givedirb("fright");
}
}
//////////////////////////////////////
if(foo==444442){
{
givedirb("fleft");}
}
if(foo==666662)
{
givedirb("fright");
}

////////////////////////
if(foo==52){
{
givedirb("down");}
}
if(foo==52)
{
givedirb("down");
}


//exit
if(foo==911){
System.out.println("Application Aborted by client!!!");

System.exit(0);
}


// Send a string!
// Close the connection, but not the server socket
dis.close();
s1.close();
}}
catch(IOException e)
{
    }
}
};
t.start();
}

public static void givedirb(String dir)
{

//System.out.println("er111"+dir);

try{
Robot bot = new Robot();
//bot.delay(2000);
//System.out.println(dir);


if(dir=="fleft")
{

bot.keyPress(KeyEvent.VK_LEFT); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_LEFT); //pressed the numpad up arrow key
bot.keyPress(KeyEvent.VK_DOWN); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_DOWN); //pressed the numpad up arrow key


}

if(dir=="fright")
{
bot.keyPress(KeyEvent.VK_RIGHT); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_RIGHT); //pressed the numpad up arrow key
bot.keyPress(KeyEvent.VK_DOWN); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_DOWN); //pressed the numpad up arrow key

}


}
catch(Exception e)
{
System.out.println("errrr"+e.toString());
}
}

//no breaks

public static void givedir(String dir)
{

//System.out.println("er111"+dir);

try{
Robot bot = new Robot();
//bot.delay(2000);
//System.out.println(dir);


if(dir=="fleft")
{

bot.keyPress(KeyEvent.VK_LEFT); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_LEFT); //pressed the numpad up arrow key


}

if(dir=="fright")
{
bot.keyPress(KeyEvent.VK_RIGHT); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_RIGHT); //pressed the numpad up arrow key

}

if(dir=="down")
{
bot.keyPress(KeyEvent.VK_DOWN); //this in documentation is non-numpad up arrow key
//System.out.println(""+dir);
bot.keyRelease(KeyEvent.VK_DOWN); //pressed the numpad up arrow key

}




}
catch(Exception e)
{
System.out.println("errrr"+e.toString());
}
}


public static void presskeys(String dir)
{



try{
Robot bot = new Robot();
//bot.delay(2000);
//System.out.println(dir);
if(dir=="pshift")
{
bot.keyPress(KeyEvent.VK_SHIFT);
bot.keyRelease(KeyEvent.VK_SHIFT);
System.out.println("Key= "+dir);
}
if(dir=="pent")
{
bot.keyPress(KeyEvent.VK_ENTER);
bot.keyRelease(KeyEvent.VK_ENTER);
System.out.println("Key= "+dir);
}
if(dir=="pctrl")
{
bot.keyPress(KeyEvent.VK_CONTROL);
bot.keyRelease(KeyEvent.VK_CONTROL);
System.out.println("Key= "+dir);
}
if(dir=="pspace")
{
bot.keyPress(KeyEvent.VK_SPACE);
bot.keyRelease(KeyEvent.VK_SPACE);

System.out.println("Key= "+dir);
}
}
catch(Exception e)
{
System.out.println("errrr"+e.toString());
}

}
////////////////////////mousemmmmmmmmmmmmmmmmmmmmmmmmmmmm
public static void mousekeys(String dir)
{

//System.out.println("er111"+dir);

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
try{
Robot bot = new Robot();
//bot.delay(2000);
int width = (int)screenSize.getWidth();
int height = (int)screenSize.getHeight();
Point p = MouseInfo.getPointerInfo().getLocation();

if(dir=="9000")
{
System.out.println(dir);
bot.mousePress(InputEvent.BUTTON1_MASK);
bot.mouseRelease(InputEvent.BUTTON1_MASK);
}
if(dir=="9111")
{System.out.println(dir);
bot.mousePress(InputEvent.BUTTON3_MASK);
bot.mouseRelease(InputEvent.BUTTON3_MASK);
}

if(dir=="2111")
bot.mouseMove(p.x,p.y-6);
if(dir=="2000")
bot.mouseMove(p.x,p.y+6);
if(dir=="2100")
bot.mouseMove(p.x-6,p.y);
if(dir=="2001")
{//System.out.println(dir);
bot.mouseMove(p.x+6,p.y);
}

if(dir=="2333")
bot.mouseMove(p.x,p.y-1);
if(dir=="2222")
bot.mouseMove(p.x,p.y+1);
if(dir=="2322")
bot.mouseMove(p.x-1,p.y);
if(dir=="2223")
{//System.out.println(dir);
bot.mouseMove(p.x+1,p.y);
}

}
catch(Exception e)
{
System.out.println("errrr"+e.toString());
}

}

}
