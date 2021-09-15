import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m = 1;
        switch (m) {
            case 0:  System.out.println("condition 0");
            case 1:  System.out.println("condition 1");
            case 2:  System.out.println("condition 2");
            case 3: System.out.println("condition 3");
                break;
            case 4:  System.out.println("condition 4");
            default: System.out.println("condition default");
        }

    }
}
