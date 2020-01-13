package PracticePart.CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

import java.util.List;

public class CSS_Selector {


    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver(" chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // lets find all buttons and click

        List<WebElement> buttons=driver.findElements(By.cssSelector(".btn btn-primary"));
        for(WebElement button:buttons){
            button.click();
            BrowserUtils.wait(1);
        }
driver.quit();
    }

}
