package elements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class practise {
    @Test
    public void demoTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        /*
        //How can you handle colors in a web driver
        driver.get("https://docs.oracle.com/javase/8/docs/api/");


        driver.switchTo().frame("classFrame");
        WebElement mydiv=driver.findElement(By.className("topNav"));

        System.out.println(Color.fromString(mydiv.getCssValue("background-color")).toString());


        //How can you enable a disabled textbox?
        driver.navigate().to("https://omayo.blogspot.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript(" document.getElementById('but1').removeAttribute('disabled')");


        //HTML form
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement name=driver.findElement(By.xpath("//input[@id='username']"));
        WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));

        name.sendKeys("tomsmith");
        pwd.sendKeys("SuperSecretPassword!");

        driver.findElement(By.id("login")).submit();

       WebElement testH4= driver.findElement(By.xpath("//h4[text()='Welcome to the Secure Area. When you are done click logout below.']"));
        Assert.assertEquals(testH4.getText(),"Welcome to the Secure Area. When you are done click logout below.");


        //double click
        driver.navigate().to("https://omayo.blogspot.com/");
        WebElement button=driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));

       WebElement searchButton= driver.findElement(By.xpath("//input[@value='Search']"));
       String myvalue=searchButton.getAttribute("title");
       System.out.println(myvalue);


        Actions act= new Actions(driver);
        act.doubleClick(button).perform();
        driver.switchTo().alert();
        driver.switchTo().alert().accept();

        act.contextClick(button).perform();*/

        //table
        driver.navigate().to("https://omayo.blogspot.com/");
        WebElement eleTable=driver.findElement(By.xpath("//table[@id='table1']"));
       List<WebElement> headings= driver.findElements(By.xpath("//thead/tr/th"));

       String heading="";

       for(WebElement ele : headings) {
           heading=ele.getText();
           System.out.println(heading);
       }
        String xpathLocatorTR="";
         int colIndex=0;




        List<WebElement> rows= driver.findElements(By.xpath("//tbody/tr"));
        for(int i=0;i<rows.size();i++) {

            xpathLocatorTR = "//tbody/tr['" + i + "']";
            WebElement row =driver.findElement(By.xpath(xpathLocatorTR));

            List<WebElement> cols= row.findElements(By.tagName("td"));
            for(int j=0;j<cols.size();j++)
            {

                System.out.println( cols.get(j).getText());
            }


            }

        }



    }



