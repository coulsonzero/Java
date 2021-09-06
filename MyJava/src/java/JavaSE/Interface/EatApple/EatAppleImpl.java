package java.JavaSE.Interface.EatApple;

/**
 * @author coulson
 * @version 2021-08-08 16:35
 */
public class EatAppleImpl implements EatApple {
    @Override
    public void eat() {
        System.out.println("一天一苹果, 医生远离我");
    }
}
