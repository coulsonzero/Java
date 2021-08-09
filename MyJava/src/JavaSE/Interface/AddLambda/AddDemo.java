package JavaSE.Interface.AddLambda;

/**
 * @author coulson
 * @version 2021-08-08 16:46
 *
 *
 * lambda:
 *      () -> {};
 *      className::func
 * 多个参数可以全都省略, 但不能只省一个
 * 参数仅有一个时,小括号可省
 * 代码块只有一条时,可省略大括号和分号
 *
 * 注意事项:
 *  使用lambda必须要有接口,而且接口中只能有一个抽象方法!
 *  必须有上下文对象
 *
 */
public class AddDemo {
    public static void main(String[] args) {
        // lambda表达式重写接口的实现类方法
        useAdd((int x, int y) -> {
            return x - y;
        });

        useAdd((x, y) -> {
            return x + y;
        });


        // 方法引用
        useAdd(Integer::sum);

        useAdd(Int::add);

    }

    private static void useAdd(Add a) {
        int sum = a.add(5, 7);
        System.out.println(sum);
    }
}
