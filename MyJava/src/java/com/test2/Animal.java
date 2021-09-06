package java.com.test2;

import java.util.Objects;

class Animal {
    String name;
    Animal(String n) {
        name = n;
    }

    @Override
    public boolean equals(Object o) {
        return ((Animal) o).name == this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Myclass {
    public static void main(String[] args) {
        Animal a1 = new Animal("Robby");
        Animal a2 = new Animal("Robby");
        System.out.println(a1 == a2);       //false
        System.out.println(a1.equals(a2));  //true
    }
}
