package by_step_aqa_q1822_tests_example_2.base_config;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Config {

    protected WebDriver driver;

    @BeforeAll
    public void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\testing\\by-step-aqa-q1822-tests-example-2\\src\\test\\resources\\chromedriverforwin7.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    //    @AfterAll

    //    public void quitDriver () {

    //    driver.quit(); }
}
