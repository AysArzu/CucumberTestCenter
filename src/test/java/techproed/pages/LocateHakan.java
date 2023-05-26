package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LocateHakan {
    public LocateHakan(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@href='index.php?page=checkboxes']")
    public WebElement checkboxes;
    @FindBy(id = "box1")
    public WebElement checkBox1;
    @FindBy(id = "box2")
    public WebElement checkBox2;
    @FindBy(xpath = "(//a[@href='index.php?page=challenging-dom'])[2]")
    public WebElement challenge;
    @FindBy(xpath = "//a[@id='c17bd9c0-0cf7-013b-4966-06f20ba472fe' and text()='qux']")
    public WebElement qux;
    @FindBy(id = "c17c1070-0cf7-013b-4967-06f20ba472fe")
    public WebElement foo;
    @FindBy(id = "c17c13d0-0cf7-013b-4968-06f20ba472fe")
    public WebElement baz;
    @FindBy(xpath = "//td[text()='Definiebas8']")
    public WebElement define;
    @FindBy(xpath = "(//a[@href='#edit' and text()='edit'])[3]")
    public WebElement edit;
    @FindBy(xpath = "(//a[contains(@href,'#delete') and contains(text(),'delete')])[10]")
    public WebElement delete;
    @FindBy(xpath = "//a[@href='index.php?page=context-menu']")
    public WebElement context;
    @FindBy(id = "hot-spot")
    public WebElement kare;
    @FindBy(xpath = "//a[@href='index.php?page=disappearing-elements']")
    public WebElement disappear;
    @FindBy(xpath = "//a[@href='/']")
    public WebElement home;
    @FindBy(xpath = "//a[@href='/contact-us/']")
    public WebElement contact;



}
