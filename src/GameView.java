import CatlinGraphics2D.AnimationCanvas2D;
import CatlinGraphics2D.ImageUtilities;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameView extends AnimationCanvas2D {
    double caol_x = 600;
    double caol_y = 400;
    double caol_xv = 0;
    double caol_yv = 0;


    GameView(int width, int height) {
        super(width, height, 100);
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void update(double elapsedMilliseconds) {
        caolArrowListen();
    }

    @Override
    public void draw(Graphics2D pen) {
        ImageUtilities.drawImage(pen, ImageUtilities.loadImage("resources/images", "caol_test.png"), (int)caol_x, (int)caol_y);
    }

    // Event key listens for caol
    // Allows user to control caol with arrow keys
    private void caolArrowListen() {
        // Checks if left and right arrow keys are pressed
        // if so, increases caol's velocity in that direction
        // else, decreases caol's velocity
        if (isKeyPressed(KeyEvent.VK_LEFT)) {
            caol_xv = -2;
        } else if (isKeyPressed(KeyEvent.VK_RIGHT)){
            caol_xv = 2;
        } else {
            caol_xv = 0;
        }

        // Checks if up and down arrow keys are pressed
        // if so, increases caol's velocity in that direction
        // else, decreases caol's velocity
        if (isKeyPressed(KeyEvent.VK_UP)) {
            caol_yv = -2;
        } else if (isKeyPressed(KeyEvent.VK_DOWN)){
            caol_yv = 2;
        } else {
            caol_yv = 0;
        }

        // Checks if more than 1 keys are pressed, if so, decreases speed
        if (!(caol_yv == 0) && !(caol_xv == 0)) {
            caol_xv /= Math.sqrt(2);
            caol_yv /= Math.sqrt(2);
        }

        // Applies velocity to x and y values
        caol_y += caol_yv;
        caol_x += caol_xv;
    }
}
