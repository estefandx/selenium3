package com.diplearn;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.File;

public class ExampleSelemiunOld extends  BaseTest {


    @Test
    public void Calculadora () throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();


        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(3000);


        driver.findElement(By.id("first-name")).sendKeys("Bryan Estefan");
        driver.findElement(By.id("last-name")).sendKeys("Moreno Diaz");
        driver.findElement(By.id("postal-code")).sendKeys("660000");
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
    }



}
