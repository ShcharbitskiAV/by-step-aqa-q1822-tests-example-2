package by_step_aqa_q1822_tests_example_2.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginBlock extends BaseBlock {

    public LoginBlock(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
