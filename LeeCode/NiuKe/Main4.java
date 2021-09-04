package NiuKe;

/**
 * @author CoulsonZero
 * @version 2021-05-21 1:19
 * @字符串排序
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 */
import java.util.*;

public class Main4 {
    public static void main(String[] args){
        //输入字符串
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            //字符串-->字符数组
            List<Character> list = new LinkedList();
            char[] chr = str.toCharArray();
            for(Character c : chr){
                if(Character.isLetter(c))
                    list.add(c);
            }
            //排序
            Collections.sort(list, new Comparator<Character>(){
                @Override
                public int compare(Character c1, Character c2){
                    //不区分大小写
                    return Character.toLowerCase(c1) - Character.toLowerCase(c2);
                }
            });

            int cnt = 0;
            for(int i = 0; i < chr.length; i++){
                if(Character.isLetter(chr[i])){
                    chr[i] = list.get(cnt);
                    cnt++;
                }
            }

            System.out.println(chr);
        }
    }
}
