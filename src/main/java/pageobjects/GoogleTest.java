package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTest {

        static WebDriver driver;
        public void browserSetup(){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/BrowserDrivers/chromedriver");
            driver = new ChromeDriver();
            //  GooglePage page = new GooglePage(driver);
            driver.get("https://www.google.com/");
        }

        public String geTTitle(){
            return (driver.getTitle());

        }
        public void close(){
            driver.close();
        }

        public void setUp(){
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void click(String value){

            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(value);


        }

        public void table(String  value){

            driver.findElement(By.xpath("//input[@name='q']")).sendKeys(value);


        }

        // driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("Selenium");
//Actions action = new Actions(driver);
//action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     //   WebDriverWait wait = new WebDriverWait(driver,30);
//    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Your Account']")));
//        driver.findElement(By.xpath("//span[text()='Your Account']")).click();
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

