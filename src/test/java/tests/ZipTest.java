package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.FileUtils;
import utils.ZipUtils;

import static helpers.Environment.passwordZipFile;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.ZipUtils.unzip;
import static utils.ZipUtils.unzipWithoutPass;


@Tag("file")
public class ZipTest {

    @Test
    void successfulZip() {
        String source = "src/test/resources/files/files_without_pass.zip";
        String destination = "src/test/resources/files/unzip";

        String expectedFileText = "Here is your text1 in file!";

        new ZipUtils();
        unzipWithoutPass(source, destination);

        String actualFileText = new FileUtils().readStringFromFile("src/test/resources/files/unzip/file1.txt");
        System.out.println("Actual text from file: \n" + actualFileText);

        assertThat(actualFileText, containsString(expectedFileText));
    }

    @Test
    void successfulZipWithPass() {
        String source = "src/test/resources/files/files_with_pass.zip";
        String destination = "src/test/resources/files/unzip_with_pass";

        String expectedFileText = "Here is your text1 in file!";

        new ZipUtils();
        unzip(source, destination, passwordZipFile);

        String actualFileText = new FileUtils().readStringFromFile("src/test/resources/files/unzip_with_pass/file1.txt");
        System.out.println("Actual text from file: \n" + actualFileText);

        assertThat(actualFileText, containsString(expectedFileText));
    }


}
