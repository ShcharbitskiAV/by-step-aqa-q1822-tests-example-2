package by_step_aqa_q1822_tests_example_2.page;

import by_step_aqa_q1822_tests_example_2.block.LoginBlock;
import by_step_aqa_q1822_tests_example_2.block.LoginFormLinkToMobileApps;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    private LoginBlock loginBlock = new LoginBlock(driver);

    private LoginFormLinkToMobileApps loginFormLinkToMobileApps = new LoginFormLinkToMobileApps(driver);

    public LoginBlock getLoginBlock() {

        return loginBlock;
    }

    public LoginFormLinkToMobileApps getLoginFormLinkToMobileApps() {
        return loginFormLinkToMobileApps;
    }
}
