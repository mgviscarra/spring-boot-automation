package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

    public static WebDriver launch() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mauricio.viscarra\\Documents\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }
}