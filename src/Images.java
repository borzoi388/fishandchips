import CatlinGraphics2D.ImageUtilities;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Images {
    static BufferedImage testLR = ImageUtilities.loadImage("resources/images", "test_sprite_leftright.png");
    static BufferedImage testUp = ImageUtilities.loadImage("resources/images", "test_sprite_up.png");
    static BufferedImage testDown = ImageUtilities.loadImage("resources/images", "test_sprite_down.png");
    static BufferedImage testStill = ImageUtilities.loadImage("resources/images", "test_sprite_still.png");
    static BufferedImage caol = ImageUtilities.loadImage("resources/images", "caol_test.png");
}
