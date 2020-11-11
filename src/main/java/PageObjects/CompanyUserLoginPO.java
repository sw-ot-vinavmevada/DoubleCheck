package PageObjects;

import BasePackage.BasePage;
import BasePackage.DynamicData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;



//import static PageObjects.CreateCompanyUserPO.email_Str;

public class CompanyUserLoginPO extends BasePage {

    public CompanyUserLoginPO(WebDriver driver) throws IOException {
        super(driver);
    }

    CreateCompanyUserPO createCompanyUserPO = new CreateCompanyUserPO();

    public By login_Btn = By.xpath("//span[contains(text(),'Login')]");
    public By logout_Btn = By.xpath("//a[contains(text(),'Logout & Proceed')]");
    public By email_Txt = By.xpath("//input[@placeholder='Username']");
    public By pass_Txt = By.xpath("//input[@placeholder='Password']");
    public By submit_Btn = By.xpath("//button[@type='submit']");

   /* public static String email_Str_Ele = "pcgen@mailinator.com";
    public static String email_Str_Wat = "pcgen@mailinator.com";
    public static String email_Str_Lig = "pcgen@mailinator.com";
    public static String email_Str_GH = "Green"+DynamicData.emailString();
    public static String email_Str_Ref = "Ref"+DynamicData.emailString();
    public static String email_Str_GenSet = "Gen"+DynamicData.emailString();
    public static String email_Str_Air = "Air"+DynamicData.emailString();
    public static String email_Str_Ven = "Ven"+DynamicData.emailString();
*/



public static String email_Str_Ele = "Elevator"+DynamicData.emailString();
    public static String email_Str_Wat = "Water"+DynamicData.emailString();
    public static String email_Str_Lig = "Light"+DynamicData.emailString();
    public static String email_Str_GH = "Green"+DynamicData.emailString();
    public static String email_Str_Ref = "Ref"+DynamicData.emailString();
    public static String email_Str_GenSet = "Gen"+DynamicData.emailString();
    public static String email_Str_Air = "Air"+DynamicData.emailString();
    public static String email_Str_Ven = "Ven"+DynamicData.emailString();


    public static String general_Email = "pcgen@mailinator.com";
    //public static String email_Str_Air = "amit.genset@mailinator.com";

public boolean CompanyUserLogin(String email) throws Exception{
///public boolean CompanyUserLogin() throws Exception{
        try {
            Thread.sleep(3000);
            WebElement login = new WebDriverWait(driver,90)
                    .until(ExpectedConditions.visibilityOfElementLocated(login_Btn));
            login.click();

            Thread.sleep(10000);
            WebElement emailID = new WebDriverWait(driver,90)
                    .until(ExpectedConditions.visibilityOfElementLocated(email_Txt));
            emailID.sendKeys(email);
            //emailID.sendKeys("pcgen@mailinator.com");
            Thread.sleep(6000);
            System.out.println("Email entered");
            WebElement submit = new WebDriverWait(driver,300)
                    .until(ExpectedConditions.visibilityOfElementLocated(submit_Btn));
            submit.click();
            System.out.println(email);
            Thread.sleep(4000);
            WebElement password = new WebDriverWait(driver,90)
                    .until(ExpectedConditions.visibilityOfElementLocated(pass_Txt));
            password.sendKeys("Softweb#123");

            WebElement submit1 = new WebDriverWait(driver,300)
                    .until(ExpectedConditions.visibilityOfElementLocated(submit_Btn));
            submit1.click();
            return true;
        }catch (Exception e){
            //return false;
            throw e;
        }
    }
}
