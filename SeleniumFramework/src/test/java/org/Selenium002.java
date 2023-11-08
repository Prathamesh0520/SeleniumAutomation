package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium002 {
    //login code in app.vwo.com
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebElement username, password, submit;
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        username= driver.findElement(By.id("login-username"));
        password= driver.findElement(By.id("login-password"));
        submit= driver.findElement(By.id("js-login-btn"));
        username.sendKeys("admin");
        password.sendKeys("admin123");
        submit.click();
        //driver.close();
        //driver.quit();

    }
}
