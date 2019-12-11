import java.awt.*;
import java.applet.*;
public class Coords extends Applet
 {
  public void paint(Graphics g)
   {
     g.setColor(Color.red);
     g.fillRect(200,100,200,200);
     g.setColor(Color.yellow);
     g.fillRect(0,0,200,100);
     g.setColor(Color.pink);
     g.fillRect(400,0,200,100);
     g.setColor(Color.blue);
     g.fillRect(0,300,200,100);
     g.setColor(Color.orange);
     g.fillRect(400,300,200,100);
   }
 }
 /*
  <applet code="Coords.class" height="400" width="600"></applet>
  */

