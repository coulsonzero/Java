package Robot.Test;

import java.awt.*;

/**
 * @author coulson
 * @version 2021-08-31 22:45
 */
public class MousePointer {
    public static void main(String[] args) {
        getPointInfo();
    }

    private static void getPointInfo(){
        int x = 0;
        int y = 0;
        while(true){
            PointerInfo pinfo = MouseInfo.getPointerInfo();
            int mx = pinfo.getLocation().x;
            int my = pinfo.getLocation().y;
            if (x!=mx||y!=my){
                x=mx;
                y=my;
                System.out.println("x:"+mx+",y:"+my);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}