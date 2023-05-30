package techproed.pages;


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

    @FindBy (xpath = "//a[text()='Multiple Windows']")
    public WebElement multipleWindow;
    @FindBy (linkText= "Click Here" )
    public WebElement clickHere;
    @FindBy (xpath = "//h3")
    public WebElement newWindow;
    @FindBy (xpath = "//a[text()='New tab']")
    public WebElement newTab;
    @FindBy (xpath = "//strong")
    public WebElement checkTheNewTab;
    @FindBy (xpath = "//strong")
    public WebElement succesMessage;

    @FindBy (xpath = "//a[text()='Radio Buttons']")
    public WebElement radioButtons;
    @FindBy (xpath = "(//input[@name='color'])[1]")
    public WebElement blue;
    @FindBy (xpath = "//input[@id='basketball']")
    public WebElement basketball;
    @FindBy (xpath = "//table[@id='table1']//tr[4]//td[1]")
    public WebElement Conway;
    @FindBy (linkText = "Sortable Data Tables")
    public WebElement dataTable;
    @FindBy (xpath = "//*[@id='table1']/tbody/tr[4]/td[6]/a[2]")
    public WebElement delete4;
    @FindBy (xpath = "//*[@id='table1']")
    public WebElement table1;
    @FindBy (xpath = "//*[@id='table2']")
    public WebElement table2;

    @FindBy (xpath = "//*[@id='table2']/tbody/tr[1]/td[2]")
    public WebElement John;
    @FindBy (xpath = "//*[@id='table2']/tbody/tr[1]/td[6]/a[2]")
    public WebElement delete1;

    @FindBy (linkText = "Registration Form")
    public WebElement registrationForm;
    @FindBy (xpath = "//input[@id='firstname']")
    public WebElement firstName;
    @FindBy (xpath = "//input[@value='female']")
    public WebElement female;
    @FindBy (xpath = "//input[@name='birthday']")
    public WebElement dateOfBirth;

    @FindBy (xpath = "//input[@id='inlineCheckbox2']")
    public WebElement java;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy (linkText = "WYSIWYG Editor")
    public WebElement wysiwyg;
    @FindBy (xpath ="//body[@id='tinymce']")
    public WebElement textKutusu;
    @FindBy (xpath ="//span[text()='Paragraph']")
    public WebElement paragraf;
    @FindBy (xpath ="//h2")
    public WebElement h2;




}
