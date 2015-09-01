
package hoofdstuk6;
import java.awt.*;
import java.applet.*;


public class vraag6_1 extends Applet {
	
//    int jan; 
//    int ali;
//    int cihan;
//    int jeannatte;
    int aantalpersonen;
    double totaal;
    double gedeeld ;
    
//    double gemiddelde;
	
	
    public void init() {
    	totaal = 113 ;
    	aantalpersonen = 4;
    	gedeeld = totaal / aantalpersonen;
        
        
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt : " + gedeeld, 20, 20);
    }
}