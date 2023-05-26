package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.LocateMali;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DroppapleStepDefinitions {
    LocateMali locate=new LocateMali();
    @Then("droppable_linkine_tıklar")
    public void droppable_linkine_tıklar() {
        locate.dropableLink.click();
        ReusableMethods.bekle(1);

    }

    @Then("elementi_buyukkare_element_içine_taşır")
    public void elementi_buyukkare_element_icine_tasır() {
        Actions action=new Actions(Driver.getDriver());
        action.clickAndHold(locate.draggable).moveToElement(locate.droppable).release().perform();
        ReusableMethods.bekle(1);
    }

    @Then("değişikliği_kontrol_eder")
    public void degisikligi_kontrol_eder() {
        Assert.assertTrue(locate.droppedText.isDisplayed());
    }


}
