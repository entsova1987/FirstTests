package homeWork;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\entso\\OneDrive\\Desktop\\driver\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://wagwalking.com/");

        String expectedTitle = "WagWalking.com | Trusted Local Dog Walkers, Pet Sitters, Trainers and More";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @AfterClass
    public static void tearDown() {

        driver.quit();
    }
}


