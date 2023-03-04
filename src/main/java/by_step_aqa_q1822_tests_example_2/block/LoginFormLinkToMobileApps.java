package by_step_aqa_q1822_tests_example_2.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFormLinkToMobileApps extends BaseBlock {

    public LoginFormLinkToMobileApps(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='LoginMobilePromoStore__link'][1]")
    public WebElement buttonGooglePlay;


    @FindBy(xpath = "//*[@class='LoginMobilePromoStore__link'][2]")
    public WebElement buttonRuStore;

    @FindBy(xpath = "//*[@class='LoginMobilePromoStore__link'][3]")
    public WebElement buttonAppStore;
}