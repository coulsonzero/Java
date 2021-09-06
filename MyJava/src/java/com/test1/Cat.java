package java.com.test1;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃🐟");
    }
    public void play() {
        System.out.println("猫在玩耍");
    }
}
