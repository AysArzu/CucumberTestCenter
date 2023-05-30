package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LocateIlhan {

    public LocateIlhan(){ PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(css = "li:nth-of-type(28) > a")
    public WebElement inputsButton;

    @FindBy(xpath = "//a[.='JQuery UI Menus']")
    public WebElement jQueryUiMenusButton;


    @FindBy(xpath = "//a[.='JavaScript Alerts']")
    public WebElement javaScriptAlertsButton;


    @FindBy(xpath = "//a[.='Multiple Buttons']")
    public WebElement multipleButtons;

    @FindBy(xpath = "//label[@class='form-label']")
    public WebElement inputsPage;


    @FindBy(xpath = "//input[@id='inputNumber']")
    public WebElement inputNumber;

    @FindBy(xpath = "//h3[.='JQueryUI - Menu']")
    public WebElement jQueryUiMenusPage;


    @FindBy(xpath = "//a[.='Enabled']")
    public WebElement enabledButton;

    @FindBy(xpath = "//a[.='Downloads']")
    public WebElement downloadsButton;

    @FindBy(xpath = "//a[.='CSV']")
    public WebElement cvsButton;

    @FindBy(xpath = "//pre[1]")
    public WebElement numberOfItems;



    @FindBy(xpath = "//ul[@id='menu']")
    public WebElement enableDisableMenu;

    @FindBy(xpath = "//h3[.='JavaScript Alerts']")
    public WebElement jsAlertsPage;



    @FindBy(xpath = "//button[.='Click for JS Alert']")//Result: You successfully clicked an alert
    public WebElement jsAlertButton;

    @FindBy(xpath = "//button[.='Click for JS Confirm']")//Result: You clicked: Ok

    public WebElement jsConfirmButton;

    @FindBy(xpath = "//button[.='Click for JS Prompt']")//Result: You entered:aa
    public WebElement jsPromptButton;

    @FindBy(xpath = "//p[@id='result']")
    public WebElement result1;//Result:

    @FindBy(css = "#result")
    public WebElement result2;



    @FindBy(xpath = "//h3[@class='h3']")
    public WebElement multipleButtonsPage;


    @FindBy(xpath = "//button[.='Button 1']")//Clicked on button one!
    public WebElement button1;


    @FindBy(xpath = "//button[.='Button 2']")//Clicked on button two!
    public WebElement button2;


    @FindBy(xpath = "//button[.='Button 3']")//Clicked on button three!
    public WebElement button3;

    @FindBy(xpath = "//button[.='Button 4']")//Clicked on button four!
    public WebElement button4;


    @FindBy(xpath = "//button[.='Button 5']")//Clicked on button five!
    public WebElement button5;

    @FindBy(xpath = "//button[@id='disappearing_button']")//Now it's gone!
    public WebElement dontClickButton;


}
