import CatlinGraphics2D.GraphicsWindow;
import java.awt.*;

public class Game {
    static void main() {
        Component gameView = new GameView(1200, 800);
        GraphicsWindow.makeWindow(gameView, "fish and chips");
    }
}
