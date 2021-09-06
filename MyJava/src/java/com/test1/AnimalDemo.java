package java.com.test1;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());  //加菲,5

        a.eat();    //猫吃🐟
//        a.play();   //无法解析
        //Animal a强制转换为Cat c, 以使用子类中的特有方法
        Cat c = (Cat) a;
        c.eat();    //猫吃🐟
        c.play();   //猫在玩耍

//        Animal d = new Dog("泰迪",2);   //新建了栈内存对象
//        System.out.println(d.getName()+","+d.getAge());  //泰迪,2
        a = new Dog("泰迪",2);    //节约内存空间，原地更改对象
        System.out.println(a.getName()+","+a.getAge());  //泰迪,2

    }
}
