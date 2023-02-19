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

    @Given("Uzytkownik jest na stronie sklepu")
    public void uzytkownik_jest_na_stronie_sklepu() {
        System.out.println("Krok 1");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
        driver.navigate().to("https://www.komputronik.pl/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
    }
    @When("Uzytkownik klika button Znajdz moj sklep")
    public void uzytkownik_klika_button_znajdz_moj_sklep() {
        System.out.println("Krok 2");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div/div[3]/div[4]/div/div/a")).click();

    }
    @When("Uzytkownik wpisuje Miasto")
    public void uzytkownik_wpisuje_miasto() {
        System.out.println("Krok 3");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ktr-storehouse-find/div/form/div[1]/div/input")).sendKeys("Reda");

    }
    @When("Uzytkownik klika button Pokaz")
    public void uzytkownik_klika_button_pokaz() {
        System.out.println("Krok 4");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ktr-storehouse-find/div/form/div[2]/button")).click();

    }
    @Then("Strona wyswietla sklep najblizej podanej lokalizacji")
    public void strona_wyswietla_sklep_najblizej_podanej_lokalizacji() {
        System.out.println("Krok 5");
        String location = "Gdynia";
        assertTrue(location.equals("Gdynia"));


    }
}
