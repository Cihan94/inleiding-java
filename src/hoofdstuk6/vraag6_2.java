
package hoofdstuk6;
import java.awt.*;
import java.applet.*;


public class vraag6_2 extends Applet {
	
	int seconden;
	int uur;
	int dag;
	int jaar;
	
    public void init() {
    	seconden = 1; 
    	uur = 60 * seconden;
    	dag = 24 * uur ;
    	jaar = 365 * dag;
        
    }

    public void paint(Graphics g) {
        g.drawString( "aantal seconden in een jaar: : " + jaar, 20, 20);
    }
}