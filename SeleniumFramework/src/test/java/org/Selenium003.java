package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium003 {
    //Register new free trial user
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        WebElement trail,email,firstname, lastname, phone, submit, password, create,show;
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        trail=driver.findElement(By.cssSelector("a[class='text-link']"));
        trail.click();
        email=driver.findElement(By.cssSelector("input[id='page-v1-step1-email']"));
        email.sendKeys("wetest@test.com");
        submit=driver.findElement(By.xpath("//button[text()='create a free trial account']"));
        submit.click();
        Thread.sleep(5000);
        firstname= driver.findElement(By.xpath("//input[@name='first_name']"));
        firstname.sendKeys("Vishal");
        lastname= driver.findElement(By.xpath("//input[@name='last_name']"));
        lastname.sendKeys("Rane");
        phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("8745123659");
        password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Admin123");
        show=driver.findElement(By.xpath("//span[@data-value='show']"));
        show.click();
        create=driver.findElement(By.xpath("//button[text()='create account']"));
        create.click();


    }
}
