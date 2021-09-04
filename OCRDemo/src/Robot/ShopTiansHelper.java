package Robot;

import Robot.Demo.BaiduAPI;

import java.awt.*;
import java.awt.event.KeyEvent;


public class ShopTiansHelper {
    private static int money;

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.delay(3000);
        // 1.截图--提取money
        try {
            BaiduAPI.saveImg();
            Thread.sleep(3000);
            money = BaiduAPI.readImg();
        } catch (Exception e) {
            System.out.println("Error: not fund the img.png");
        }

        System.out.println(money);
        if (money < 100000) {
            /* 闲聊 */
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.delay(1000);
            /* 折扣 */
            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);
            robot.delay(1000);
            /* 出售 */
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.delay(1000);
        } else {
            System.out.println(money);
        }
    }
}


