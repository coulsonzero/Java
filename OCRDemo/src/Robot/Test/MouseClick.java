package Robot.Test;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @author coulson
 * @version 2021-08-30 22:26
 */
public class MouseClick {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(3000);  //robot.setAutoDelay(100);
        robot.mouseMove(322, 400);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); //2是按下滚轮,robot.mouseWheel(5); 3是按下鼠标右键。robot.mouseWheel(5);
    }
}
