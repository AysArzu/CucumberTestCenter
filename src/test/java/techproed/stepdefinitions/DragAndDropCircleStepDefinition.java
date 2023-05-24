package techproed.stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.LocateMali;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DragAndDropCircleStepDefinition {
    LocateMali locate=new LocateMali();
    @Then("dragAndDropCircle_linkine_tıklar")
    public void drag_and_drop_circle_linkine_tıklar() {
       locate.dragAndDropCirceles.click();
        ReusableMethods.bekle(1);

    }
    @Then("daire_elementini_buyukdaire_elementi_yerine_tasir")
    public void daire_elementini_buyukdaire_elementi_yerine_tasir() {
      // ReusableMethods.dragAndDropByJS(locate.elementCircle,locate.elementCircleTarget);
        Actions action=new Actions(Driver.getDriver());
        action.dragAndDrop(locate.elementCircle,locate.elementCircleTarget).perform();
       ReusableMethods.bekle(1);
    }
    @Then("yer_değişikliğini_kontrol_eder")
    public void yer_değişikliğini_kontrol_eder() {
        Assert.assertTrue(locate.circlesText.getText().contains("You did great!"));
    }

}
