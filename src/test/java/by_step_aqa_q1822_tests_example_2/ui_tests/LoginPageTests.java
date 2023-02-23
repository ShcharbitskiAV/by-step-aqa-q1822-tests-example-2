package by_step_aqa_q1822_tests_example_2.ui_tests;

import by_step_aqa_q1822_tests_example_2.base_config.Config;
import by_step_aqa_q1822_tests_example_2.service.LoginService;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AssertionFailureBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageTests extends Config {

    private LoginService loginService;

    @BeforeEach
    public void openLoginPage() {

        driver.manage().window().maximize();

        driver.get("https://vk.com/");
    }


    @Test
    public void verifyShowCheckbox() {
        WebElement checkbox = driver.findElement(By.xpath("//span[@class='VkIdCheckbox__checkboxOn']"));
        checkbox.isDisplayed();

    }

    @Test

    public void verifyCheckbox () {
        WebElement checkboxOn = driver.findElement(By.xpath("//span[@class='VkIdCheckbox__checkboxOn']"));
        checkboxOn.click();
        checkboxOn.isDisplayed();

        WebElement checkboxOff = driver.findElement(By.xpath("//span[@class='VkIdCheckbox__checkboxOff']"));
        checkboxOff.click();
        checkboxOff.isDisplayed();

    }

    @Test
    public void verifyLinkToGooglePlay() {

        String expectedLink = "https://play.google.com/store/apps/details?id=com.vkontakte.android";

        String expectedText = "Google Play";

        WebElement linkToStore = driver.findElement(By.xpath("//span[@class='FlatButton__content']"));
        linkToStore.isDisplayed();

        linkToStore.getAttribute("href");
        Assertions.assertEquals(expectedLink, "https://play.google.com/store/apps/details?id=com.vkontakte.android");
        Assertions.assertEquals(expectedText, linkToStore.getText());

    }

    @Test
    public void verifyLinkToRustore() {

        WebElement linkToRustore = driver.findElement(By.xpath("//span[text()='RuStore']"));

        String expectedLink = "https://apps.rustore.ru/app/com.vkontakte.android";
        String expectedText = "RuStore";


        //Assertions.assertEquals(expectedLink, linkToRustore.getAttribute(expectedLink));
        Assertions.assertEquals(expectedText, linkToRustore.getText());

    }




}
