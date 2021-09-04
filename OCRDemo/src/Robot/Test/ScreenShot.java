package Robot.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @author coulson
 * @version 2021-08-29 23:08
 */


public class ScreenShot {
    public static void saveImg() throws Exception {
        // 获取屏幕尺寸
        // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // 创建需要截取的矩形区域
        Rectangle rect = new Rectangle(440, 147, 210, 70);
        // 截屏操作
        BufferedImage bufImage = new Robot().createScreenCapture(rect);
        // 保存截取的图片
        ImageIO.write(bufImage, "png", new File("src\\Robot.image\\img.png"));
    }

    public static void main(String[] args) throws Exception {
        ScreenShot.saveImg();
    }
}
