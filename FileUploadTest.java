package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;

public class FileUploadTest
{
    @Test
    public void UploadFile() {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        File doc= new File("src/main/resources/welcome.txt");

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys(doc.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();

       // Assert.assertEquals(doc.getT);
        String actualFileName=driver.findElement(By.id("uploaded-files")).getText();
        String expectedFileName="welcome.txt";
        Assert.assertEquals(actualFileName,expectedFileName);
    }


}