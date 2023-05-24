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
    @FindBy(xpath = "//a[text()=\"Drag and Drop Circles\"]")
    public WebElement dragAndDropCirceles;
    @FindBy(id = "column-a")
    public WebElement elementA;
    @FindBy(id = "column-b")
    public WebElement elementB;
    @FindBy(id = "draggable")
    public WebElement elementCircle;
    @FindBy(id = "droptarget")
    public WebElement elementCircleTarget;
    @FindBy(xpath = "//div[text()=\"You did great!\"]")
    public WebElement circlesText;



}
