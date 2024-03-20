package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nestedFrames {
    @Test
    public void frameTest()
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");


        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement frameleft= driver.findElement(By.xpath("//body"));
        String text1=frameleft.getText();
        System.out.println(text1);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        WebElement framemiddle= driver.findElement(By.xpath("//body"));
        String text2=framemiddle.getText();
        System.out.println(text2);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        WebElement frameRight= driver.findElement(By.xpath("//body"));
        String text3=frameRight.getText();
        System.out.println(text3);

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        WebElement frameBottom= driver.findElement(By.xpath("//body"));
        String text4=frameBottom.getText();
        System.out.println(text4);


    }
}
