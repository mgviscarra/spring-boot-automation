package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Browser {

    public static WebDriver launch() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        String host = "http://localhost:4444/wd/hub";
        options.setAcceptInsecureCerts(true);
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mauricio.viscarra\\Documents\\ChromeDriver\\chromedriver.exe");
        RemoteWebDriver driver = new RemoteWebDriver(new URL(host),options);
        return driver;
    }
}