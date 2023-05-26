package techproed.stepdefinitions;

import io.cucumber.java.en.Then;
import techproed.pages.LocateHakan;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class HakanDisappearing {
    LocateHakan locateHakan=new LocateHakan();
    @Then("Disappear menu linkini tiklar")
    public void disappear_menu_linkini_tiklar() {
        locateHakan.disappear.click();
    }
    @Then("kullanici home butonu ustune gider")
    public void kullanici_home_butonu_ustune_gider() {
        ReusableMethods.moveToElementWithAction(locateHakan.home);
    }
    @Then("kullanici home butonunu tiklar")
    public void kullanici_home_butonunu_tiklar() {
       locateHakan.home.click();
    }
    @Then("kullanici contact us butonu ustune gider")
    public void kullanici_contact_us_butonu_ustune_gider() {
        ReusableMethods.moveToElementWithAction(locateHakan.contact);
    }
    @Then("kullanici contact us butonunun kliklenebilir oldugunu dogrular")
    public void kullanici_contact_us_butonunun_kliklenebilir_oldugunu_dogrular() {
        assertTrue(locateHakan.contact.isEnabled());
    }
    @Then("kullanici contact us butonunu tiklar")
    public void kullanici_contact_us_butonunu_tiklar() {
       locateHakan.contact.click();
    }





}
