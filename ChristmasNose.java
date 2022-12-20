import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class ChristmasNose extends JComponent { 
	
	  private int width;
	  private int height;

	  public ChristmasNose(int w, int h) {
		  width = w;
		  height = h;
	  }


      protected void paintComponent(Graphics g) {
	  Graphics2D g2d = (Graphics2D) g;
	  
	  Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
	  g2d.setColor(new Color(100,149,237)); 
	  g2d.fill(background);
	  
	  Ellipse2D.Double first_ball = new Ellipse2D.Double(250,230,180,180);
	  g2d.setColor(Color.WHITE);
	  g2d.fill(first_ball);
	  
	  Ellipse2D.Double second_ball = new Ellipse2D.Double(275,150,130,130);
	  g2d.setColor(Color.WHITE);
	  g2d.fill(second_ball);
	  
	  Ellipse2D.Double third_ball = new Ellipse2D.Double(290,75,100,100);
	  g2d.setColor(Color.WHITE);
	  g2d.fill(third_ball);
	  
	  Ellipse2D.Double first_eye = new Ellipse2D.Double(310,100,20,20);
	  g2d.setColor(new Color(27, 2, 39)); 
	  g2d.fill(first_eye);
	  
	  Ellipse2D.Double second_eye = new Ellipse2D.Double(350,100,20,20);
	  g2d.setColor(new Color(27, 2, 39)); 
	  g2d.fill(second_eye);
	  
	  Rectangle2D.Double nose = new Rectangle2D.Double(335,120,10,30);
	  g2d.setColor(new Color(255, 127, 0)); 
	  g2d.fill(nose);
	  
	  
	  
	
}
}


