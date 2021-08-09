package JavaSE.Interface.AddLambda;

/**
 * @author coulson
 * @version 2021-08-08 16:46
 *
 * 函数式接口:
 *  使用@FunctionalInterface 检验是否为函数式接口,即可被lambda使用,仅有一个抽象方法
 */
@FunctionalInterface
public interface Add {
    // public abstract
    int add(int a, int b);

    // default
    default void show(){
        System.out.println("hello");
    }
}
