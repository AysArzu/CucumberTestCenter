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






}
