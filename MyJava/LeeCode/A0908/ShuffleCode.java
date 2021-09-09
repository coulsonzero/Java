package LeeCode.A0908;

/**
 * 随机8位数密码
 *
 * @author coulson
 * @version 2021-09-08 18:53
 */
public class ShuffleCode {
    public static void main(String[] args) {
        System.out.println(shuffleCode());
    }
    public static StringBuilder shuffleCode() {
        int x = (int) (Math.random() * 10);
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(x);
        for (int i=0; i<20; i++) {
            if (sb.length() == 8) break;
            int y = (int) (Math.random() * 10);
            if (!sb.toString().contains(Integer.toString(y))) {
                sb.append(y);
            }
        }
        return sb;
    }
}
