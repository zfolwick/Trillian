package com.certifiai;
package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();
        // Initialize the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Verify the title of the page
        String pageTitle = driver.getTitle();
        assertEquals("Google", pageTitle);
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

