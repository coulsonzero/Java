package Robot.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author coulson
 * @version 2021-08-30 22:06
 */
public class KeyPress {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);
        // 双倍
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.delay(1000);
        // 闲聊
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.delay(1000);
        // 折扣
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.delay(1000);
        // 出售
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(1000);
    }
}
