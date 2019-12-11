    import java.applet.Applet;  
    import java.awt.Graphics;  
      
    public class Parameter extends Applet{  
      
    public void paint(Graphics g){  
    String str=getParameter("msg");  
    g.drawString(str,50, 50);  
    }  
      
    }  
