package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.time.Duration;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tStart");
        //
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = new HtmlUnitDriver(false);

        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // 0 by default
        driver.manage().window().maximize();

        //
        driver.get("https://demo.opencart.com/");
        Thread.sleep(2000); // For Presentation
        System.out.println("\tdemo.opencart.com opened, title = " + driver.getTitle());
        //
        driver.findElement(By.cssSelector("li.list-inline-item a.dropdown-toggle[href='']")).click();
        Thread.sleep(2000); // For Presentation
        System.out.println("\ta.dropdown-toggle.show clicked");
        //
        driver.findElement(By.cssSelector("a[href*='account/register']")).click();
        Thread.sleep(2000); // For Presentation
        System.out.println("\ta[href*='account/register'] clicked");

        //
        WebElement txtFirstName = driver.findElement(By.id("input-firstname"));
        txtFirstName.click();
        txtFirstName.clear();
        txtFirstName.sendKeys("Oksana");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tfirstName typed");
        //

        //
        WebElement txtLastName = driver.findElement(By.id("input-lastname"));
        txtLastName.click();
        txtLastName.clear();
        txtLastName.sendKeys("Kushnir");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tlastName typed");
        //

        //
        WebElement lblEmail = driver.findElement(By.id("input-email"));
        lblEmail.click();
        lblEmail.clear();
        lblEmail.sendKeys("test@gmail.com");
        Thread.sleep(1000); // For Presentation
        System.out.println("\tlblEmail typed");
        //

        //
        WebElement txtPassword = driver.findElement(By.id("input-password"));
        txtPassword.click();
        txtPassword.clear();
        txtPassword.sendKeys("password");
        Thread.sleep(1000); // For Presentation
        System.out.println("\ttxtPassword typed");
        //

        //
        WebElement btnContinue = driver.findElement(By.cssSelector("button.btn.btn-primary"));
        btnContinue.click();
        System.out.println("\tbtnContinue clicked");
        //

        Thread.sleep(2000);
        driver.quit();
        System.out.println("\tDone");

    }
}

