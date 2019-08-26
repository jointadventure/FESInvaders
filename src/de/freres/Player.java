package de.freres;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Token {
    private String name;

    public int getScore() {
        return score;
    }

    private int score;
    static protected BufferedImage image;
    static {
        try {
            image = ImageIO.read(Alien.class.getResource("/SpaceShip.bmp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Player(String name, int posx, int posy){
        super(posx, posy);
        this.name = name;
        lifePoints = 3;
    }

    public Shot shoot(){
        return new Shot(posx, posy, "up");
    }

    @Override
    public BufferedImage getImage() {
        return Player.image;
    }

    public void settleScore () {
        score += 10;
        System.out.println("Score:" + score);
    }

    public void payShot () {
        score -= 1 ;
        System.out.println("Score" + score);
    }
}