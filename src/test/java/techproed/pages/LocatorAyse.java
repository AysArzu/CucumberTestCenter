package techproed.pages;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LocatorAyse {
    public LocatorAyse() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (linkText ="Add/Remove Elements" )
    public WebElement addRemove;
    @FindBy (xpath = "//button[text()='Add Element']" )
    public WebElement addElement;
    @FindBy (xpath ="//button[text()='Delete']" )
    public WebElement delete;
    @FindBy (xpath ="//a[text()='Autocomplete']" )
    public WebElement autoComplete;
    @FindBy (xpath ="//input[@id='myCountry']" )
    public WebElement textBox;
    @FindBy (xpath ="//input[@type='hidden']" )
    public WebElement ulke1;
    @FindBy (xpath ="//input[@type='button']" )
    public WebElement submit;
    @FindBy (xpath ="//p[@id='result']" )
    public WebElement result;
    @FindBy (linkText ="//Broken Images" )
    public WebElement brokenImages;
    @FindBy (linkText= "Challenging DOM" )
    public WebElement challengingDom;














}
