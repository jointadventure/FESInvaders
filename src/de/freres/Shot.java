package de.freres;

import java.awt.*;

public class Shot extends Token{

    String dir;

    public Shot(int posx, int posy, String dir){
        super(posx, posy);
        this.dir = dir;

    }

    public void shotPosition(){
        if(dir == "up"){
            posy = posy -10;
        }
        else{
            posy = posy +10;
        }
    }


    @Override
    public void draw(Graphics g){
        g2d = (Graphics2D) g;
        Stroke stroke2 = new BasicStroke(2f);

        g2d.setColor(Color.WHITE);
        g2d.setStroke(stroke2);

        g2d.drawLine(10,10,10,0);
    }
}
