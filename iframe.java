package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe {
    @Test
    public void iframeTest()
    {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tinymce");

        WebElement iFrame= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrame);

        WebElement editor= driver.findElement(By.id("tinymce"));
        editor.clear();
        editor.sendKeys("My name is Gaytri");
    }
}
