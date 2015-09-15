package hoofdstuk8;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class vraag8_1 extends Applet {
TextField tekstvak;
  Button okknop;	
  Button resetknop;
  Label label;
  String tekst;
	
    public void init() {
    	this.setSize(new Dimension(200,100));
    	label = new Label ();
    	add(label);
    	tekstvak = new TextField("", 20);
        add(tekstvak);
    	okknop = new Button();
    	KnopListener1 kl1 = new KnopListener1();
    	okknop.addActionListener(kl1);
        okknop.setLabel( "ok" );
        add(okknop);
        resetknop = new Button();
        KnopListener2 kl2 = new KnopListener2();
        resetknop.addActionListener(kl2);
        resetknop.setLabel( "reset" );
        add(resetknop);
        tekst = new String("");

    }

    public void paint(Graphics g) {
     g.drawString(tekst, 80, 80);
    }
    class KnopListener1 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	tekst = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
        	tekst = ("");
        	tekstvak.setText("");
            repaint();
        }
}
}