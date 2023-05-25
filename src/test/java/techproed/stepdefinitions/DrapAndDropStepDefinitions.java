package techproed.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.LocateMali;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class DrapAndDropStepDefinitions {
    LocateMali locate=new LocateMali();

    @Given("kullanici_testCenterTechPro_sayfasina_gider")
    public void kullanici_test_center_tech_pro_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(1);

}

    @Given("a_elementini_b_elementi_yerine_getirir")
    public void a_elementini_b_elementi_yerine_getirir() throws AWTException {
        Actions action=new Actions(Driver.getDriver());
        //action.dragAndDrop(locate.elementA, locate.elementB).perform();
        ReusableMethods.bekle(1);
        //action.clickAndHold(locate.elementA).moveToElement(locate.elementB).release().perform();
        //action.clickAndHold(locate.elementA).moveByOffset(70,120).release().perform();
        //js executor ile
        WebElement sourceElement= locate.elementA;
        WebElement targetElement= locate.elementB;
        ReusableMethods.dragAndDropByJS(sourceElement,targetElement);
       /*
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String script = "function createEvent(typeOfEvent) {\n" +
                "    var event = document.createEvent(\"CustomEvent\");\n" +
                "    event.initCustomEvent(typeOfEvent, true, true, null);\n" +
                "    event.dataTransfer = {\n" +
                "        data: {},\n" +
                "        setData: function (key, value) {\n" +
                "            this.data[key] = value;\n" +
                "        },\n" +
                "        getData: function (key) {\n" +
                "            return this.data[key];\n" +
                "        }\n" +
                "    };\n" +
                "    return event;\n" +
                "}\n" +
                "\n" +
                "function dispatchEvent(element, event, transferData) {\n" +
                "    if (transferData !== undefined) {\n" +
                "        event.dataTransfer = transferData;\n" +
                "    }\n" +
                "    if (element.dispatchEvent) {\n" +
                "        element.dispatchEvent(event);\n" +
                "    } else if (element.fireEvent) {\n" +
                "        element.fireEvent(\"on\" + event.type, event);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "function simulateHTML5DragAndDrop(element, target) {\n" +
                "    var dragStartEvent = createEvent('dragstart');\n" +
                "    dispatchEvent(element, dragStartEvent);\n" +
                "    var dropEvent = createEvent('drop');\n" +
                "    dispatchEvent(target, dropEvent, dragStartEvent.dataTransfer);\n" +
                "    var dragEndEvent = createEvent('dragend');\n" +
                "    dispatchEvent(element, dragEndEvent, dropEvent.dataTransfer);\n" +
                "}\n" +
                "\n" +
                "var sourceElement = arguments[0];\n" +
                "var targetElement = arguments[1];\n" +
                "simulateHTML5DragAndDrop(sourceElement, targetElement);";
        js.executeScript(script, sourceElement, targetElement);

        */



    }

    @Given("b_elementinin_a_elementi_yerinde_olduğunu_test_eder")
    public void b_elementinin_a_elementi_yerinde_olduğunu_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("dragAndDrop_linkine_tıklar")
    public void draganddrop_linkine_tıklar() {
        locate.dragAndDrop.click();
        ReusableMethods.bekle(1);


    }

    @And("yer_değişikliğini_kontrol_et")
    public void yer_degisikligini_kontrol_et() {
        Assert.assertEquals(locate.elementB.getText(),"A");
    }
}
