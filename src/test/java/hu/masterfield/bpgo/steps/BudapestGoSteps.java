package hu.masterfield.bpgo.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BudapestGoSteps {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setup() {
        //Selenium webdriver setup
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void cleanup() {
         driver.quit();
    }

    @Given("^open main page$")
    public void openMainPage() throws InterruptedException {
       // driver.get("https://go.bkk.hu");
       // wait.until(driver -> driver.findElement(By.xpath("//body/div[@id='body-content']/div[@id='app-content']/div[@id='toolbar']/div[1]/a[1]")));  //selenide-al majd átírni
        homePage
    }

    @And("^accept cookies$")
    public void acceptCookies() {
        //elfogadom gombra kattint
        driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[3]/button[2]")).click();

    }

    @Given("language is set to {string}")
    public void languageIsSetTo(String language) throws Throwable {
        WebElement languageTable = wait.until(driver ->driver.findElement(By.cssSelector("#languagetable")));
        if(language.equals("english")) {
            //english flag-re kattint
            languageTable.findElement(By.cssSelector("#languagetable > span:nth-child(2)")).click();
        }
        if(language.equals("hungarian")) {
            //magyar flag-re kattint
            languageTable.findElement(By.cssSelector("#languagetable > span:nth-child(1)")).click();
        }
    }

    @When("change the language to {string}")
    public void changeTheLanguageTo(String language) throws Throwable {
        languageIsSetTo(language);
    }

    @Then("^it shows elements in \"([^\"]*)\"$")
    public void itShowsElementsIn(String language) throws Throwable {
        WebElement header = wait.until(driver -> driver.findElement(By.cssSelector("#panel-context-view > div > h2")));
        if(language.equals("hungarian")) {
           assertEquals("Utazástervezés", header.getText());
        }
        if(language.equals("english")) {
            assertEquals("Trip Planner", header.getText());
        }
    }
}
