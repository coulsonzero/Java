package JavaSE.Modifier;

/**
 * @author coulson
 * @version 2021-07-20 13:12
 */

class staticDemo {
    static void func() {
        System.out.println("static is running!");
    }
}
class Test {
    public static void main(String[] args) {
        staticDemo.func();  // static is running!
    }
}
