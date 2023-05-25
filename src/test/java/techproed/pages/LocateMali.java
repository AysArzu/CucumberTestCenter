package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LocateMali {
    public LocateMali(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()=\"Drag and Drop\"]")
    public WebElement dragAndDrop;
    @FindBy(id = "column-a")
    public WebElement elementA;
    @FindBy(id = "column-b")
    public WebElement elementB;
}
