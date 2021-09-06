package java.JavaSE.Interface.InterfaceUpdate;

/**
 * @author coulson
 * @version 2021-08-08 17:42
 */
public class CarDemo {
    public static void main(String[] args) {
        Car car = new CarImpl();
        // 接口的abstract方法
        car.move();
        car.run();
        car.defaultMethod();  // 接口的default方法, 可以被实现类重写
        Car.staticMethod();  // 接口的static方法,只能被接口调用
    }
}
