package com.certifiai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class AppTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://certifiai-demo.local");
    }

    // @Test
    // public void canNavigateToDemoSite() {
    // String pageTitle = driver.getTitle();
    // assertEquals("CertifiAI Demonstration", pageTitle);
    // }

    @Test
    public void canGetInfoForImage() {
        List<WebElement> forms = driver.findElements(By.xpath("/html/body/center/form[1]/p[1]/input"));
        System.out.println(forms.get(0).getText());
        forms.get(0).click();
        // System.out.println(forms.get(0).findElement(By.tagName("input")).getText());
    }

    // @AfterEach
    // public void tearDown() {
    // // Close the browser
    // if (driver != null) {
    // driver.quit();
    // }
    // }
}
