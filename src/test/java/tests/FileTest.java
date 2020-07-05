package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.FileUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("file")
public class FileTest {

    @Test
    void successfulSearchText() {
        String expectedFileText = "Here is your text1 in file!";
        String actualFileText = new FileUtils().readStringFromFile("src/test/resources/files/file.txt");
        System.out.println("Actual text from file: \n" + actualFileText);

        assertThat(actualFileText, containsString(expectedFileText));
    }
}
