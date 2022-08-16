package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Auther: yingliming
 * @Date: 2022/8/16 0016 - 08 - 16 - 19:40
 * @Description: Test
 * @Version: 1.0
 **/
public class ImageTest {

    @Test
    void Test01(){
        try {
            BufferedImage image = ImageIO.read(new File("F:\\maven_PJ\\Test_tank\\src\\main\\java\\images\\bulletD.gif"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
