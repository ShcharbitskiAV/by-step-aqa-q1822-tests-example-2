package by_step_aqa_q1822_tests_example_2.service;

import by_step_aqa_q1822_tests_example_2.page.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginService extends BaseService {

    public LoginService(WebDriver driver) {
        super(driver);
    }

    private LoginPage loginPage = new LoginPage(driver);

    public LoginPage getLoginPage() {

        return loginPage;
    }
}
