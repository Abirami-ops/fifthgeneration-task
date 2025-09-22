package linkedin;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utils {

    // screenshots
    public static void takeScreenshot(WebDriver driver, String filePath) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File(filePath));
        System.out.println("✅ Screenshot saved at: " + filePath);
    }
}
