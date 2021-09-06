package java.JavaSE.Interface.EatApple;

/**
 * @author coulson
 * @version 2021-08-08 16:36
 */
public class EatAppleDemo {
    public static void main(String[] args) {
        /*
        EatApple e = new EatAppleImpl();
        e.eat();
        */


        // 匿名内部类
        /*
        useEatApple(new EatApple() {
            @Override
            public void eat() {
                System.out.println("一天一苹果, 医生远离我");
            }
        });
        */


        // lambda表达式
        useEatApple( () -> {
            System.out.println("一天一苹果, 医生远离我");
        });


    }
    private static void useEatApple(EatApple e) {
        e.eat();
    }
}
