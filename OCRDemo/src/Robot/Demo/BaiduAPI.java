

package Robot.Demo;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author coulson
 * @version 2021-08-29 21:19
 */

public class BaiduAPI {
    private static final String APP_ID = "24768609";
    private static final String API_KEY = "BNPXUxglAyM8QcG1RRZ9z1RF";
    private static final String SECRET_KEY = "b51CqlbZy3TOissI5SSGhdjVCW9Kj24C";

    public static int readImg() {
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
        // 调用接口
        String path = "src\\Robot.image\\img.png";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        String s = res.toString(2);
        s = s.replace("\n", "").replace(" ", "");

        Matcher m = Pattern.compile("(\\d+)").matcher(s);
        String money = "";
        if (m.find())
            money = m.group();
        return Integer.parseInt(money);
    }

    public static void saveImg() throws Exception {
        // 获取屏幕尺寸
        // Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // 创建需要截取的矩形区域
        Rectangle rect = new Rectangle(440, 147, 210, 70);
        // 截屏操作
        BufferedImage bufImage = new Robot().createScreenCapture(rect);
        // 保存截取的图片
        ImageIO.write(bufImage, "png", new File("src\\Robot.image\\img.png"));
    }


    public static void main(String[] args) throws Exception {
        // Sample.saveImg();
        System.out.println(BaiduAPI.readImg());
    }
}
