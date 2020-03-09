package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IETesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("Main page " + title);
        driver.quit();
    }
}
