package JavaSE.Operator;

import java.util.Objects;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 13:35
 */

class Value {
    int v;

    // cmd -> ”OSK“ 调用虚拟键盘
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return v == value.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}
public class EqualsDemo {
    public static void main(String[] args) {
        //基本类型比较
        Value v1 = new Value();
        Value v2 = new Value();
        v1.v = 100;
        v2.v = 100;
        System.out.println(v1.equals(v2)); //false  比较引用  覆盖后true
        System.out.println(v1.v == v2.v);  //true   比较内容
    }
}
