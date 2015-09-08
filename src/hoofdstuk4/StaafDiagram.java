package hoofdstuk4;
import java.awt.*;
import java.applet.Applet;


public class StaafDiagram extends Applet {
		     
int Valerie;
int Hans;
int Jeroen;

public void init () {
	
setSize (500,500);

	Jeroen = 115;
	Valerie = 40;
	Hans = 80;
			
}
		      public void paint(Graphics draw) 
		      {
				    
		    	setBackground(Color.gray);
		        draw.drawLine(35, 260, 400, 260);
		        draw.drawLine(35, 260, 35, 100);
		        draw.drawString("Valerie", 100, 290);
		        draw.drawString("Hans", 200, 290);
		        draw.drawString("Jeroen", 300, 290);
		        draw.drawString("20", 20, 245);
		        draw.drawString("40", 20, 225);
		        draw.drawString("60", 20, 205);
		        draw.drawString("80", 20, 185);
		        draw.drawString("100", 13, 165);
		        draw.drawString("120", 13, 145);
		        draw.setColor(Color.yellow);
		        draw.fillRect(105, 260 - Valerie, 30, Valerie);
		        draw.setColor(Color.red);
		        draw.fillRect(200, 260 - Hans, 30, Hans);
		        draw.setColor(Color.blue);
		        draw.fillRect(305, 260 - Jeroen, 30, Jeroen);
		      }
		      
		    		    
		    
}
	 	


    
