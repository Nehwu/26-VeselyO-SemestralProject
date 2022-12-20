import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class ChristmasCanvas extends JComponent {
  
  private int width;
  private int height;

  public ChristmasCanvas(int w, int h) {
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
	  
	  
	 
	  
	
  }
}

