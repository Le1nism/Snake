import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class MenuScene extends Scene {

    public KeyListener KeyListener;

    public MenuScene(KeyListener KeyListener) {

        this.KeyListener = KeyListener;
    }

    @Override
    public void update(double dt) {

        if (KeyListener.isKeyPressed(KeyEvent.VK_UP)) {

            System.out.println("UP");
        }
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
    }
    
}
