package utils;

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;


public class ZipUtils {

    public static void unzipWithoutPass(String source, String destination) {
        unzip(source, destination, null);
    }

    public static void unzip(String source, String destination, char[] password) {


        try {
            ZipFile zipFile = new ZipFile(source);
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(password);
            }
            zipFile.extractAll(destination);
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
