import CatlinGraphics2D.AnimationCanvas2D;
import CatlinGraphics2D.ImageUtilities;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameView extends AnimationCanvas2D {
    double char_x = 600;
    double char_y = 400;
    double char_xv = 0;
    double char_yv = 0;

    Color black = new Color(0, 0, 0);


    GameView(int width, int height) {
        super(width, height, 100);
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void update(double elapsedMilliseconds) {
        charArrowListen();
    }

    @Override
    public void draw(Graphics2D pen) {


        if (!(char_xv == 0)) {
            //Draws char moving left or right
            ImageUtilities.drawCenteredImage(pen, ImageUtilities.flipImage(Images.testLR, isKeyPressed(KeyEvent.VK_LEFT), false), (int) char_x, (int) char_y);

        } else if (isKeyPressed(KeyEvent.VK_UP)) {
            //Draws char moving up
            ImageUtilities.drawCenteredImage(pen, Images.testUp, (int) char_x, (int) char_y);

        } else if (isKeyPressed(KeyEvent.VK_DOWN)) {
            //Draws char moving down
            ImageUtilities.drawCenteredImage(pen, Images.testDown, (int) char_x, (int) char_y);

        } else {
            //Draws default char
            ImageUtilities.drawCenteredImage(pen, Images.testStill, (int) char_x, (int) char_y);
        }

        pen.setColor(black);
        pen.drawString("HELLO WORKD", 600, 400);
    }

    // Event key listens for char
    // Allows user to control char with arrow keys
    private void charArrowListen() {
        // Checks if left and right arrow keys are pressed
        // if so, increases char's velocity in that direction
        // else, decreases char's velocity
        if (isKeyPressed(KeyEvent.VK_LEFT)) {
            char_xv = -2;
        } else if (isKeyPressed(KeyEvent.VK_RIGHT)){
            char_xv = 2;
        } else {
            char_xv = 0;
        }

        // Checks if up and down arrow keys are pressed
        // if so, increases char's velocity in that direction
        // else, decreases char's velocity
        if (isKeyPressed(KeyEvent.VK_UP)) {
            char_yv = -2;
        } else if (isKeyPressed(KeyEvent.VK_DOWN)){
            char_yv = 2;
        } else {
            char_yv = 0;
        }

        // Checks if more than 1 keys are pressed, if so, decreases speed
        if (!(char_yv == 0) && !(char_xv == 0)) {
            char_xv /= Math.sqrt(2);
            char_yv /= Math.sqrt(2);
        }

        // Applies velocity to x and y values
        char_y += char_yv;
        char_x += char_xv;
    }
}
