package java.JavaSE.Interface.USBDemo;

/**
 * @author coulson
 * @version 16.0.1 2021-07-20 16:18
 */

public class Cire implements CalInterface
{
    public float getArea(float r)
    {
        return PI*r*r;  //返回计算后的圆面积
    }
    public float getCircumference(float r)
    {
        return 2*PI*r;           //返回计算后的圆周长
    }
    public static void main(String[] args)
    {
        Cire c = new Cire();
        float f = c.getArea(2.0f);
        System.out.println(Float.toString(f));
    }
}
