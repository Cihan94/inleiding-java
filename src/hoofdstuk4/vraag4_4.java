package hoofdstuk4;
import java.awt.*;
import java.applet.*;

import java.applet.Applet;

public class vraag4_4 extends Applet {
		     
		      public void paint(Graphics draw) 
		      {
				    
		    	setBackground(Color.gray);
		        draw.drawLine(35, 300, 400, 300);
		        draw.drawLine(35, 300, 35, 150);
		        draw.drawString("Valerie", 100, 320);
		        draw.drawString("Hans", 200, 320);
		        draw.drawString("Jeroen", 300, 320);
		        draw.drawString("20", 20, 290);
		        draw.drawString("40", 20, 270);
		        draw.drawString("60", 20, 250);
		        draw.drawString("80", 20, 230);
		        draw.drawString("100", 13, 210);
		        draw.drawString("120", 13, 190);
		        draw.setColor(Color.yellow);
		        draw.fillRect(105, 260, 30, 40);
		        draw.setColor(Color.red);
		        draw.fillRect(200, 220, 30, 80);
		        draw.setColor(Color.blue);
		        draw.fillRect(305, 200, 30, 100);
		      }
		      
		    		    
		    
	  }
	 	
