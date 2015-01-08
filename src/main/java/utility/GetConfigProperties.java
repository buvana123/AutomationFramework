package utility;
/**
 * Created by vivek.pemawat on 08/01/15.
 */

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class GetConfigProperties {
    public static Properties properties=new Properties();
    GetConfigProperties() {
        try {
            File file = new File("src/main/resources/config/config.properties");
            FileInputStream fileInput = null;
            fileInput = new FileInputStream(file);
            properties.load(fileInput);
        } catch (Exception e) {

        }

    }

}
