package hoofdstuk4;
import java.awt.*;
import java.applet.*;

import java.applet.Applet;

public class vraag4_2 extends Applet {

	 public void init() {
		 		 	 
	 }
	
	  public void paint(Graphics g) {
		    setBackground(Color.blue); 
		    g.drawLine(50, 120, 100, 20);
		    g.drawLine(50, 120, 150, 120);
		    g.drawLine(100, 20, 150, 120) ;
		    g.drawRect(50, 120, 100, 150);
		    g.drawRect(85, 220, 30, 50);
		    g.drawRect(60, 150,50, 30);



		    
		    
	  }
	 	
}