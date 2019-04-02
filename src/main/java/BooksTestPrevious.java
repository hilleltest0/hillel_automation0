//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class BooksTestPrevious {
    private WebDriver driver;

    @Before
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        System.out.println("0. Open main page");
        driver.get("http://it-ebooks.info/");
    }

    @Test
    public void searchTestJava() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("1. Find search");
        driver.findElement(By.id("q"));
        System.out.println("2. Enter search parameters");
        driver.findElement(By.id("q")).sendKeys("Java 11");
        Thread.sleep(2000);
        System.out.println("3. Press Enter");
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("row")));

        System.out.println("4. Check 'gsc-result-info-container'");
        Assert.assertNotNull(driver.findElement(By.className("gsc-result-info-container")));
    }

    @Test
    public void searchTestCss() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("1. Find search");
        driver.findElement(By.id("q"));
        System.out.println("2. Enter search parameters");
        driver.findElement(By.id("q")).sendKeys("CSS");
        Thread.sleep(2000);
        System.out.println("3. Press Enter");
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("row")));

        System.out.println("5. Check 'gsc-orderby-container'");
        Assert.assertNotNull(driver.findElement(By.className("gsc-orderby-container")));
    }

    @Test
    public void searchTestPhp() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("1. Find search");
        driver.findElement(By.id("q"));
        System.out.println("2. Enter search parameters");
        driver.findElement(By.id("q")).sendKeys("PHP");
        Thread.sleep(2000);
        System.out.println("3. Press Enter");
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("row")));


        System.out.println("5. Check 'gsc-orderby-container'");
        Assert.assertNotNull(driver.findElement(By.className("gsc-orderby-container")));
    }

    @Test
    public void searchTestRuby() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        System.out.println("1. Find search");
        driver.findElement(By.id("q"));
        System.out.println("2. Enter search parameters");
        driver.findElement(By.id("q")).sendKeys("Ruby On Rails");
        Thread.sleep(2000);
        System.out.println("3. Press Enter");
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("row")));

        System.out.println("5. Check 'gsc-orderby-container'");
        Assert.assertNotNull(driver.findElement(By.className("gsc-orderby-container")));
    }

    @After
    public void exitAndClear() {
        System.out.println("6. Exit");
        driver.quit();
    }
}
