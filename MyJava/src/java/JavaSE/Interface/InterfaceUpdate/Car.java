package java.JavaSE.Interface.InterfaceUpdate;

/**
 * @author coulson
 * @version 2021-08-08 17:25
 */
public interface Car {
    // public abstract
    void move();
    void run();

    // public default
    // 可被接口的实现类重写, 主要用于实现接口的升级, 而不破坏现有的代码,
    default void defaultMethod() {
        System.out.println("Car default 方法执行了");
        privateMethod();
        privateStaticMethod();
    }

    // public static
    // 只能被该接口调用, 只能调用private static 方法
    static void staticMethod(){
        System.out.println("Car static 方法执行了");
        privateStaticMethod();
    }

    // 可以被default调用
    private void privateMethod(){
        System.out.println("接口的private方法被调用了");
    }

    // default 和 static都可调用
    private static void privateStaticMethod(){
        System.out.println("接口的private static方法被调用了");
    }
}
