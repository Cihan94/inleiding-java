package hoofdstuk2;
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class vraag2_2 extends Applet {

  //een (lege) methode die de Applet initialiseert
  public void init() { 
	setBackground(Color.white);

  }
  //een methode die de inhoud van het scherm tekent
  public void paint(Graphics g) {
	g.setColor(Color.blue);
    g.drawString ("Cihan", 50, 60 );
    g.setColor(Color.red); 
    g.drawString ("Akkoc", 50, 80 );
  }

}