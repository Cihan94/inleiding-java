
package hoofdstuk6;
import java.awt.*;
import java.applet.*;


public class vraag6_3 extends Applet {
	
	int a;
	int b;
	int c;

    public void init() {
    	a =30;
    	b =20;
    	c-= a+b;
    	
    }

    public void paint(Graphics g) {
        g.drawString( "uitkomst : " + c, 20, 20);
    }
}