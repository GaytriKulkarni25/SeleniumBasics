package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class complexFrames {
    @Test
    public void frameTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://docs.oracle.com/javase/8/docs/api/");

        List<WebElement> frames=driver.findElements(By.tagName("frame"));
        int noOfFrames=frames.size();
        int s=0;
        int index=0;

        for(int i=0;i<noOfFrames;i++)
        {

            driver.switchTo().frame(i);

            s=driver.findElements(By.linkText("Description")).size();
            if(s>0)
            {
                index=i;
                driver.switchTo().parentFrame();
                break;

            }
            driver.switchTo().parentFrame();

        }
        driver.switchTo().frame(index);
        driver.findElement(By.linkText("Description")).click();



    }
}
