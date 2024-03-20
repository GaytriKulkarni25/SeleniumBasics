package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.Iterator;
import java.util.Set;

public class handle {

    @Test
    public void testHandle() {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

        String handleCurrent= driver.getWindowHandle();
        System.out.println(handleCurrent);

        WebElement fr=driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(fr);
        WebElement link=driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();
       Set<String> handleList=driver.getWindowHandles();
       Iterator<String> I1=handleList.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!(child_window==handleCurrent))
                System.out.println(driver.switchTo().window(child_window).getTitle());
        }


    }


}
