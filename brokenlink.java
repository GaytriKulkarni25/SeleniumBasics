package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenlink {
    @Test
    public void verifyLink() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.qafox.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement ele : links) {
            String url = ele.getAttribute("href");
            System.out.println("-----------");
            System.out.println("URL :" + url);

            if (url == "" || url.isEmpty()) {
                System.out.println( "url is blank");
                continue;
            }
            HttpsURLConnection huc;
            try {
                huc=(HttpsURLConnection) (new URL(url).openConnection());
                huc.connect();
                if(huc.getResponseCode()>=400)
                    System.out.println(url+" is broken");
                else
                System.out.println(url+" is a valid link");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}



