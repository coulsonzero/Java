package java.com.test1;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("įĢåđ");
    }
    public void play() {
        System.out.println("įĢå¨įŠč");
    }
}
