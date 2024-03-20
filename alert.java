package elements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class alert {
    @Test
    public void alertHanding() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        driver.manage().window().maximize();


        //simple aert
        WebElement ele=driver.findElement(By.linkText("See an example alert"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",ele);
        ele.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert= wait.until(ExpectedConditions.alertIsPresent());
        String alertText=alert.getText();
        alert.accept();

        //confirm alert
       WebElement confirmEle=driver.findElement(By.linkText("See a sample confirm"));

       js.executeScript("arguments[0].scrollIntoView(true)",confirmEle);
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.elementToBeClickable(confirmEle));
        js.executeScript("arguments[0].click()",confirmEle);
        Alert alert1= wait1.until(ExpectedConditions.alertIsPresent());
        String alertText1=alert1.getText();
        alert1.accept();


        //confirm alert
        WebElement promptEle=driver.findElement(By.linkText("See a sample prompt"));

        js.executeScript("arguments[0].scrollIntoView(true)",promptEle);
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait2.until(ExpectedConditions.elementToBeClickable(promptEle));
        js.executeScript("arguments[0].click()",promptEle);
        Alert alert2= wait2.until(ExpectedConditions.alertIsPresent());
        String alertText2=alert2.getText();
        alert2.sendKeys("welcome");
        alert2.accept();


    }


}
