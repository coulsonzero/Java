package Soultion;

public class ReverseString {
    public static void main(String[] args){
        String string="nowcoder";
        //强类型转换
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前:"+string);
        System.out.println("字符串反转后:"+reverse);
    }
}
