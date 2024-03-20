package elements;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class screenshot {
    @Test
    public void getScreen() throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile= new File("./screenshots/omayo.png");
        FileUtils.copyFile(SrcFile,destFile);




    }


}
