package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class information {
    @Test
    public void checkElements()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/inputs.html");
        WebElement range=driver.findElement(By.name("range_input"));
       boolean visibility=range.isDisplayed();
        Assert.assertEquals(visibility,true);

        WebElement button1=driver.findElement(By.name("button_input"));
        boolean enable=button1.isEnabled();
        Assert.assertEquals(enable,true);

        WebElement check=driver.findElement(By.name("checkbox_input "));
        boolean checked=check.isSelected();
        Assert.assertEquals(checked,true);
    }

}
