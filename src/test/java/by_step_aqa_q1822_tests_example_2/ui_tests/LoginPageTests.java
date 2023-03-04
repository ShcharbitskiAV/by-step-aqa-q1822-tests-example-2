package by_step_aqa_q1822_tests_example_2.ui_tests;

import by_step_aqa_q1822_tests_example_2.base_config.Config;
import by_step_aqa_q1822_tests_example_2.service.LoginService;
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

    public void verifyCheckbox() {
        WebElement checkboxOn = driver.findElement(By.xpath("//span[@class='VkIdCheckbox__checkboxOn']"));
        checkboxOn.click();
        checkboxOn.isDisplayed();

        WebElement checkboxOff = driver.findElement(By.xpath("//span[@class='VkIdCheckbox__checkboxOff']"));
        checkboxOff.click();
        checkboxOff.isDisplayed();

    }

    @Test
    public void verifyLinkToGooglePlay() {

        loginService = new LoginService(driver);

        String expectedLink = "https://play.google.com/store/apps/details?id=com.vkontakte.android";
        String expectedText = "Google Play";

        String actualLink = loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonGooglePlay.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonGooglePlay.getText();

        Assertions.assertTrue(loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonGooglePlay.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyLinkToRuStore() {

        loginService = new LoginService(driver);

        String expectedLink = "https://apps.rustore.ru/app/com.vkontakte.android";
        String expectedText = "RuStore";

        String actualLink = loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonRuStore.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonRuStore.getText();


        Assertions.assertTrue(loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonRuStore.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyLinkToAppStore() {

        loginService = new LoginService(driver);

        String expectedLink = "https://itunes.apple.com/ru/app/id564177498";
        String expectedText = "App Store";

        String actualLink = loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonAppStore.getAttribute("href");
        String actualText = loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonAppStore.getText();

        Assertions.assertTrue(loginService.getLoginPage().getLoginFormLinkToMobileApps().buttonAppStore.isDisplayed());
        Assertions.assertEquals(expectedLink, actualLink);
        Assertions.assertEquals(expectedText, actualText);
    }


}
