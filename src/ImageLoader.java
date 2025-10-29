import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageLoader {
    public static Image loadImage(String filePath) {
        try {
            BufferedImage image = ImageIO.read(new File(filePath));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
