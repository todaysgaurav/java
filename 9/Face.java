import java.awt.*;
import java.applet.*;
public class Face extends Applet
 {
  public void paint(Graphics g)
   {
    g.drawOval(100,100,400,350);
    g.drawOval(200,215,50,30);
    g.drawOval(350,215,50,30);
    g.drawOval(70,250,30,70);
    g.drawOval(500,250,30,70);
    g.setColor(Color.pink);
    g.fillOval(260,350,80,30);
    g.setColor(Color.red);
    g.fillOval(287,185,20,20);
    g.setColor(Color.black);
    g.fillOval(219,224,10,10);
    g.setColor(Color.black);
    g.fillOval(369,224,10,10);
    g.drawLine(270,330,330,330);
    g.drawLine(270,330,300,250);
    g.drawLine(300,250,330,330);
    g.setFont(new Font("default", Font.BOLD, 25));
     g.drawString("Designed by: Ankit", 180,480);
   }
 } 
 /*
  <applet code="Face.class" height="400" width="600"></applet>
  */
