import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class GameScene extends Scene {

    Rect background, foreground;
    Snake snake;

    public GameScene() {

        background = new Rect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        foreground = new Rect(24, 48, 24 * 31, 24 * 22);
        snake = new Snake(5, 48, 48 + 24, 24, 24);
    }

    @Override
    public void update(double dt) {

    }

    @Override
    public void draw(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.BLACK);
        g2.fill(new Rectangle2D.Double(background.x, background.y, background.width, background.height));

        g2.setColor(Color.WHITE);
        g2.fill(new Rectangle2D.Double(foreground.x, foreground.y, foreground.width, foreground.height));

        snake.draw(g2);
    }
    
}
