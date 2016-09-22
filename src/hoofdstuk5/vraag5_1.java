package hoofdstuk5;
import java.awt.*;
import java.applet.Applet;

import static java.awt.Color.magenta;
import static java.awt.Color.red;

/**
 * Created by cihan on 22-9-2016.
 */
public class vraag5_1 extends Applet {
Color Kleur;
int Breedte;
int Hoogte;

    public void init() {
        setSize(1100, 550);
        Breedte = 300;
        Hoogte = 200;
        Kleur = red;
    }

    public void paint(Graphics draw) {
        draw.drawString("Lijn", 170, 45);
        draw.drawString("Rechthoek", 150, 268);
        draw.drawString("Afgeronde rechthoek", 120, 500);
        draw.drawString("Gevulde rechthoek met ovaal", 415, 268);
        draw.drawString("Taartpunt met ovaal eromheen", 740, 268);
        draw.drawString("Gevulde ovaal", 460, 500);
        draw.drawString("Circel", 805, 500);
        draw.drawLine(30, 30, Breedte, 30);
        draw.drawRect(30, 50, Breedte, Hoogte);
        draw.drawRoundRect(30, 280, Breedte, Hoogte, 30, 30);
        draw.setColor(Kleur);
        draw.fillRect(350, 50, Breedte, Hoogte);
        draw.setColor(Color.black);
        draw.drawOval(350, 50, Breedte, Hoogte);
        draw.setColor(Kleur);
        draw.fillOval(350, 280, Breedte, Hoogte);
        draw.setColor(Color.black);
        draw.drawOval(670, 50, Breedte, Hoogte);
        draw.setColor(Kleur);
        draw.fillArc(670, 50, Breedte,Hoogte, 0, 45);
        draw.setColor(Color.black);
        draw.drawOval(720, 280, 200, Hoogte);


    }
}