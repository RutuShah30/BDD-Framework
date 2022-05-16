package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class addBrand extends basePage {
    @FindBy(xpath = "//input[@id = 'brand_name']")
    WebElement brandname;
    @FindBy(xpath = "//input[@class = 'file-caption-name']")
    WebElement brandimage;
    @FindBy(xpath = "//input[@name='brand_image']")
    WebElement browseimage;


    public addBrand(WebDriver driver) {
        super(driver);
    }
    public void addnewBrand(){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        brandname.sendKeys("TEST333");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        try {
            //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            Runtime.getRuntime().exec("C:\\Users\\mrman\\BDD-Framework\\SriRam- KareHealth\\src\\test\\UploadFile.exe");
        } catch (Exception e){
            System.out.println("Something went wrong!");
            }
        browseimage.click();
      //  brandimage.sendKeys("src/test/TEST.JPG");

    }

}
