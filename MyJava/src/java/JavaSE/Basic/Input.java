package java.JavaSE.Basic;

import java.util.Scanner;

/**
 * Input
 */
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("How old are you ?    ");
        int age= sc.nextInt();

        //System.out.print("What's your name ?   ");
        String name = sc.next();        //input: "hello coulson" --> "hello"

        //System.out.print("Where are you from ? ");
        String country = new Scanner(System.in).nextLine();    //input: "hello coulson" --> "hello coulson" 包含空格

        //System.out.printf("age: %d \nname: %s\ncoutry: %s\n", age, name, country);
    }
}
