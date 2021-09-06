package java.JavaSE.Interface.InterfaceUpdate;

/**
 * @author coulson
 * @version 2021-08-08 17:27
 *
 * 接口的实现类:
 *   必须重写接口的所有抽象方法! 当更新接口时,需要改变接口的实现类,不方便.
 */
public class CarImpl implements Car{
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }

    /*
    @Override
    public void defaultMethod() {
        System.out.println("CarImpl default 方法执行了");
    }
     */


}
