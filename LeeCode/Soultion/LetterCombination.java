package Soultion;

/**
 * @author CoulsonZero
 * @version 2021-05-31 20:11
 */
public class LetterCombination {
    public static void main(String[] args) {
        char[] letter = new char[26];
        for (int i =0; i<letter.length; i++){
            letter[i] = (char) ('a' + i);
        }
        int count = (int) Math.pow(2, letter.length)-1;
        for (int i=1;i<=count; i++) {
            int index = 0;
            for (int j=i;j>0;j/=2){
                if(j%2 == 1)
                    System.out.print(letter[index]);
                index++;
            }
            System.out.println();
        }
    }
}
