package java.JavaSE.Basic;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder s = new StringBuilder(str);
        s.append(" coulson");                       //增
        s.insert(0, "hi");
        s.delete(1, 3);                             //删
        s.reverse();                                //查
        s.replace(1,5,"load");  //改
        int len   = s.length();
        int index = s.indexOf("llo");
        char x    = s.charAt(5);
        String string = s.toString();




    }
}
