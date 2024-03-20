import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LaunchChrome
{
    public static void main(String[] args)
    {
        WebDriver driver =new ChromeDriver();
        //ChromeOptions co= new ChromeOptions();
        //co.setBrowserVersion("116");
        driver.get("https://www.ebay.com/");

        WebElement ele=driver.findElement(By.linkText("register"));
        ele.click();

        WebElement account= driver.findElement(By.cssSelector("input[value='businessaccount']"));
        account.click();

        driver.manage().window().maximize();

        WebElement businessName= driver.findElement(By.id("businessName"));
        businessName.sendKeys("BusinessName");

        WebElement businessEmail= driver.findElement(By.id("businessEmail"));
        businessEmail.sendKeys("gvg2512@gmail.com");

        WebElement businessPassword= driver.findElement(By.id("bizPassword"));
        businessPassword.sendKeys("Mukta@0911");

        //WebElement showBizPassword= driver.findElement(By.id("showbizPassword"));
       // showBizPassword.click();

        WebElement drop= driver.findElement(By.id("businessCountry"));
        Select sel= new Select(drop);

        List<WebElement> opt= sel.getOptions();
        sel.selectByIndex(1);
        System.out.println(sel.getFirstSelectedOption().toString());

        int itemCount = opt.size();

        for(int l = 0; l < itemCount; l++)
        {
            System.out.println(opt.get(l).getText());
        }



    }
}