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
    @FindBy(xpath = "//a[text()='Droppable']")
    public WebElement dropableLink;
    @FindBy(xpath = "//a[text()='Dropdown']")
    public WebElement dropdownLink;

    @FindBy(xpath = "//a[text()=\"Drag and Drop Circles\"]")
    public WebElement dragAndDropCirceles;
    @FindBy(id = "column-a")
    public WebElement elementA;
    @FindBy(id = "column-b")
    public WebElement elementB;
    @FindBy(id = "draggable")
    public WebElement draggable;
    @FindBy(id = "droppable")
    public WebElement droppable;

    @FindBy(id = "draggable")
    public WebElement elementCircle;
    @FindBy(id = "droptarget")
    public WebElement elementCircleTarget;
    @FindBy(xpath = "//div[text()=\"You did great!\"]")
    public WebElement circlesText;
    @FindBy(xpath = "//p[text()='Dropped!']")
    public WebElement droppedText;
    @FindBy(id = "dropdown")
    public WebElement simpleDropdown;
    @FindBy(id = "year")
    public WebElement year;
    @FindBy(id = "month")
    public WebElement month;
    @FindBy(id = "day")
    public WebElement day;
    @FindBy(id = "state")
    public WebElement state;
    @FindBy(xpath = "//select[@name='Languages']")
    public WebElement language;
    @FindBy(id = "dropdownMenuButton1")
    public WebElement dropdownButton;







}
