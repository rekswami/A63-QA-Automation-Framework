import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest{
    @Test
    public void registrationNavigation()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String url="https://qa.koel.app/";
        driver.get(url);
        WebElement regisLink=driver.findElement(By.cssSelector("a[href='registration']"));
        regisLink.click();
        String regisURL = "https://qa.koel.app/registration";
        Assert.assertEquals(driver.getCurrentUrl(),regisURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.quit();
    }
}
