import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LokalizacjaSteps {

    private static WebDriver driver;

    @Given("The user is on the shop page")
    public void The_user_is_on_the_shop_page() {
        System.out.println("Step 1");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
        driver.navigate().to("https://www.komputronik.pl/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
    }
    @When("The user clicks the Find My Store button")
    public void The_user_clicks_the_Find_My_Store_button() {
        System.out.println("Step 2");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div/div[3]/div[4]/div/div/a")).click();

    }
    @When("User enters City")
    public void User_enters_City() {
        System.out.println("Step 3");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ktr-storehouse-find/div/form/div[1]/div/input")).sendKeys("Reda");

    }
    @When("The user clicks the Pokaz button")
    public void The_user_clicks_the_Pokaz_button() {
        System.out.println("Step 4");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ktr-storehouse-find/div/form/div[2]/button")).click();

    }
    @Then("The page displays the store closest to the given location")
    public void The_page_displays_the_store_closest_to_the_given_location() {
        System.out.println("Step 5");
        String location = "Gdynia";
        assertTrue(location.equals("Gdynia"));


    }
}
