package Soultion;

public class FindRepeatNum2 {
    public static void main(String[] args) {
        String str = "abcdefghigklmnopqrstuvwxyz";
        int num = 26;
        for (int i = 0; i<(1<<num); i++) {
            for (int j =0; j<num; j++) {
                if ((i&(1<<j)) != 0) {
                    System.out.printf("%c", str.charAt(j));
                }
            }
            System.out.println();
        }


    }
}
