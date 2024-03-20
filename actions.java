package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class actions {
    //@Test
    public void playAction()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        driver.manage().window().maximize();

        Actions act= new Actions(driver);

        WebElement box= driver.findElement(By.id("clickable"));
        act.moveToElement(box)
                .pause(Duration.ofSeconds(5))
                .clickAndHold()
                .pause(Duration.ofSeconds(5))
                .sendKeys("Hello")
                        .perform();


    }

    //@Test
    public void keyboardActions()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
        driver.manage().window().maximize();

        Actions act= new Actions(driver);
        act.keyDown(Keys.SHIFT).sendKeys("a").perform();
        act.keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("b").perform();
    }

    @Test
    public void MouseActions()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
        driver.manage().window().maximize();
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));


        Actions act= new Actions(driver);
        act.dragAndDrop(draggable,droppable).perform();

    }
}
