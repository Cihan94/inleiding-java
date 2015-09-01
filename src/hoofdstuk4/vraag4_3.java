package hoofdstuk4;
import java.awt.*;
import java.applet.*;

import java.applet.Applet;

public class vraag4_3 extends Applet {

	 private int height;

	public void init() {
		 		 	 
	 }
	
	  public void paint(Graphics g) {
		    setBackground(Color.yellow);
		    g.setColor(Color.red);
		    g.drawRect(50, 20, 100, 20);
		    g.fillRect(50, 20, 100, 20);
		    g.setColor(Color.white);
		    g.drawRect(50, 40, 100, 20);
		    g.drawRect(40, 20, 10, 180);
		    g.fillRect(50, 40, 100, 20);
		    g.fillRect(40, 20, 10, 180);
		    g.setColor(Color.blue);
		    g.drawRect(50, 60, 100, 20);
		    g.fillRect(50, 60, 100, 20); 

		    
		    
	  }
	 	
}