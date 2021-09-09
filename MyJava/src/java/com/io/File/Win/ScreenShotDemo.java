package java.com.io.File.Win;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShotDemo {
    public static void main(String[] args) throws AWTException, IOException {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect = new Rectangle(0,0,screenSize.width,screenSize.height);
        BufferedImage bufferedImage = new Robot().createScreenCapture(rect);
        ImageIO.write(bufferedImage, "PNG", new File("C:\\Users\\21059\\Desktop\\hello.png"));
    }
}
