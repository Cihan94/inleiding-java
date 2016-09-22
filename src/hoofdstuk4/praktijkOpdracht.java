package hoofdstuk4;
import java.awt.*;
import java.applet.Applet;


/**
 * Created by cihan on 22-9-2016.
 */
public class praktijkOpdracht extends Applet {

    public void init () {
        setSize (1100,550);

    }
        public void paint(Graphics draw)
    {
        draw.drawString("Lijn" , 170,45);
        draw.drawString("Rechthoek" , 150,268);
        draw.drawString("Afgeronde rechthoek" , 120,500);
        draw.drawString("Gevulde rechthoek met ovaal" , 415,268);
        draw.drawString("Taartpunt met ovaal eromheen" , 740,268);
        draw.drawString("Gevulde ovaal" , 460,500);
        draw.drawString("Circel" , 805,500);
        draw.drawLine(30,30,330,30);
        draw.drawRect(30,50,300,200);
        draw.drawRoundRect(30,280,300,200,30,30);
        draw.setColor(Color.magenta);
        draw.fillRect(350,50,300,200);
        draw.setColor(Color.black);
        draw.drawOval(350,50,300,200);
        draw.setColor(Color.magenta);
        draw.fillOval(350,280,300,200);
        draw.setColor(Color.black);
        draw.drawOval(670,50,300,200);
        draw.setColor(Color.magenta);
        draw.fillArc(670,50,300,200,0,45);
        draw.setColor(Color.black);
        draw.drawOval(720,280,200,200);


    }




}
