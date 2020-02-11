package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

    static WebDriver driver;
    public void browserSetup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/BrowserDrivers/chromedriver");
        driver = new ChromeDriver();
        //  GooglePage page = new GooglePage(driver);
        driver.get("https://www.Amazon.com/");
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
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(value);
        }

       public void todayDeal()
       { driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
    }
    }


