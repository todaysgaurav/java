    import java.applet.Applet;  
    import java.awt.*;  
      
    public class GraphicsDemo extends Applet{  
      
    public void paint(Graphics g){  
    g.setColor(Color.red);  
    g.drawString("Welcome",50, 50);  
    g.drawLine(20,30,20,300);  
    g.drawRect(70,100,30,30);  
    g.fillRect(170,100,30,30);  
    g.drawOval(70,200,30,30);  
      
    g.setColor(Color.pink);  
    g.fillOval(170,200,30,30);  
    g.drawArc(90,150,30,30,30,270);  
    g.fillArc(270,150,30,30,0,180);  
      
    }  
    }  
    
    
    
/*

Displaying Graphics in Applet

java.awt.Graphics class provides many methods for graphics programming.
Commonly used methods of Graphics class:

    public abstract void drawString(String str, int x, int y): is used to draw the specified string.
    public void drawRect(int x, int y, int width, int height): draws a rectangle with the specified width and height.
    public abstract void fillRect(int x, int y, int width, int height): is used to fill rectangle with the default color and specified width and height.
    public abstract void drawOval(int x, int y, int width, int height): is used to draw oval with the specified width and height.
    public abstract void fillOval(int x, int y, int width, int height): is used to fill oval with the default color and specified width and height.
    public abstract void drawLine(int x1, int y1, int x2, int y2): is used to draw line between the points(x1, y1) and (x2, y2).
    public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer): is used draw the specified image.
    public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used draw a circular or elliptical arc.
    public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle): is used to fill a circular or elliptical arc.
    public abstract void setColor(Color c): is used to set the graphics current color to the specified color.
    public abstract void setFont(Font font): is used to set the graphics current font to the specified font.


*/
