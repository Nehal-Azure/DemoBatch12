package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest1 {
    @Test
    public void testDemo1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Current Url is found as: "+driver.getCurrentUrl());
        Assert.assertEquals(actualUrl,expectedUrl);
        driver.quit();



    }
    @Test
    public void testDemo2(){

        System.out.println("This is demo test 2 statment");




    }
     @Test
    public void testDemo3(){

        System.out.println("This is demo test 3 added via remote");




    }
     @Test
    public void testDemo4(){

        System.out.println("This is demo test 4 added via remote");




    }
    @Test
    public void testDemo5(){

        System.out.println("This is demo test 5 added via remote");




    }
}
