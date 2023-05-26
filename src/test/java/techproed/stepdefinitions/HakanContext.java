package techproed.stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.LocateHakan;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class HakanContext {
    LocateHakan locateHakan=new LocateHakan();
    @Then("Context menu linkini tiklar")
    public void context_menu_linkini_tiklar() {
        locateHakan.context.click();
    }
    @Then("kullanici karenin icine sag klik yapar")
    public void kullanici_karenin_icine_sag_klik_yapar() {
        WebElement element = locateHakan.kare;
        Actions action = new Actions(Driver.getDriver());
        action.contextClick(element).perform();
    }
    @Then("kullanici cikan alerti kapatir")
    public void kullanici_cikan_alerti_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("kullanici sayfada refresh yapar")
    public void kullanici_sayfada_refresh_yapar() {
        Driver.getDriver().navigate().refresh();
    }




}
