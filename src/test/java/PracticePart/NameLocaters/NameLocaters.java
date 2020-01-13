package PracticePart.NameLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class NameLocaters {
    public static void main(String[] args) {


      WebDriver driver= BrowserFactory.getDriver("chrome");
      driver.get("http://practice.cybertekschool.com/sign_up");
      driver.findElement(By.name("full_name")).sendKeys("UserUser");
      driver.findElement(By.name("email")).sendKeys("UserName@icloud.com");
      driver.findElement(By.name("wooden_spoon")).click();
      BrowserUtils.wait(5);
      driver.quit();






    }
}
