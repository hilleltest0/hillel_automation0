import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("step1: Open main page.");
        driver.get("http://testing-ground.scraping.pro/login");
        Thread.sleep(1000);

        System.out.println("step2: Enter username.");
        driver.findElement(By.id("usr"));

        driver.findElement(By.id("usr")).sendKeys("admin");
        Thread.sleep(1000);

        System.out.println("step3: Enter password.");
        driver.findElement(By.id("pwd"));
        driver.findElement(By.id("pwd")).sendKeys("12345");

        Thread.sleep(1000);
        driver.findElement(By.id("usr")).sendKeys(Keys.ENTER);
    }

    @Test
    public void loginCheck() throws InterruptedException {
        System.out.println("step4: Check result.");
        Assert.assertNotNull(driver.findElement(By.className("success")));
        Thread.sleep(1000);
    }

    @After
    public void clearTest() {
        System.out.println("step5: Close browser.");
        driver.quit();
    }
}
