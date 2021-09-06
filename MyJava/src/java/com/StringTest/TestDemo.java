package java.com.StringTest;

/**
 * @author CoulsonZero
 * @version 2021-05-28 14:35
 */
public class TestDemo {
    public static void main(String[] args) {
        String str = "coul&&son&&22";
        String str1 = "Shville";
        char[] chars = str.toCharArray();
        System.out.println(chars);
        //增
        System.out.println(str.concat(", ").concat(str1));
        //删/改
        System.out.println(str.substring(0,str.indexOf("&&"))+str.substring(str.indexOf("&&")+2));
        //具体实例删除“&&”
        System.out.println(str.replace("&&", ""));
        //通用删除"&&“
        StringBuilder a = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != '&') {
                a.append(str.charAt(i));

            }
        }
        System.out.println(a); //coulson22

        //查
        System.out.println(str.indexOf('s'));
        System.out.println(str.charAt(4));




        int[] arr={1,2,3};
//        for (int i=0; i<arr.length,i++)

    }
}
