package TestCases.CreateCompanyUser;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.CompanyUserLoginPO;
import PageObjects.CreateCompanyUserPO;
import TestCases.CreateHardwareKit.HWKitAirQualityTC;
import TestCases.CreateHardwareKit.HWKitElevatorTC;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAirQualityUserTC extends BaseTest {

    int Flag = 1;

    public CreateAirQualityUserTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }
   /* public ElevatorCompanyUserTC(WebDriver driver) {
    }
*/

    @Test
    public void verifyCreateCompanyUser_AirQuality() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("To Verify User is able to add air quality solution");
            ExtentTestManager.getTest().assignCategory("Air Quality Solution");
            log.info("Create Company User For Air Quality Solution Test Started");
        }


        //Pre Condition:- Create Hardware Kit
        HWKitAirQualityTC hwKitAirQualityTC = new HWKitAirQualityTC(driver,1);
        //hwKitAirQualityTC.verifyAddHWKit();


        CommonMethods commonMethods = new CommonMethods(driver);
        CreateCompanyUserPO companyUserPO = new CreateCompanyUserPO(driver);
        CompanyUserLoginPO companyUserLoginPO = new CompanyUserLoginPO(driver);


        //Step 1: Open URL
        Assert.assertTrue(commonMethods.openUrl(companyUserPO.AirQualityUrl), "Unable to Open End User URL");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Browser should get open and should provide End User URL", "Browser got redirected to the Welcome page");

        Thread.sleep(4000);
        //Step 1:Click on Link Create New Account
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.newAccount_Lnk1), "Unable to Click on Link Create New Account");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Clicks on Create New Account Link", "User got redirected on Create New Account Page");
        Thread.sleep(3000);

        //Step 2:Enter Company Name
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.companyName_Txt, companyUserPO.compName), "Unable to Enter Company Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Company Name", "Test Data: "+companyUserPO.compName);

        //Step 3:Enter Contact Number
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.contactNumber_Txt, "9876543210"), "Unable to Enter Contact Number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Contact Number", "Test Data: 9876543210");

        //Step 4:Enter Address
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.address_Txt, "Test Address"), "Unable to Enter Address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Address", "Test Data: Test Address");

        //Step 5:Select Country
        Assert.assertTrue(commonMethods.selectValueFromDD(companyUserPO.country_DD,companyUserPO.country , companyUserPO.country_Value), "Unable to Select Country");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Country", "Test Data: "+companyUserPO.country);

        Thread.sleep(6000);
        //Step 6:Select state
        Assert.assertTrue(commonMethods.selectValueFromDD(companyUserPO.state_DD, companyUserPO.state, companyUserPO.state_Value),"Unable to Select State");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select state", "Test Data: "+companyUserPO.state);

        //Step 7:Enter City
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.city_Txt, companyUserPO.city), "Unable to Enter City");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter City", "Test Data: "+companyUserPO.city);

        //Step 8:Select TimeZone
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.timeZone_DD));
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.timeZone_Value), "Unable to Select TimeZone");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select TimeZone", "Test Data: UTC-11");

        //Step 9:Enter ZipCode
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.zip_Txt, "345634"), "Unable to Enter ZipCode");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter ZipCode", "Test Data: 345634");

        //Step 10:Enter First Name
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.fName_Txt, "Tom" + companyUserPO.fName_Str), "Unable to Enter First Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter First Name", "Test Data: Tom"+companyUserPO.fName_Str);

        //Step 11:Enter Last Name
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.lName_Txt, "Miller" + companyUserPO.lName_Str), "Unable to Enter Last Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Last Name", "Test Data: Miller"+companyUserPO.lName_Str);

        //Step 12:Enter Email Address
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.email_Txt, companyUserLoginPO.email_Str_Air), "Unable to Enter Email Address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Email Address", "Test Data: "+companyUserLoginPO.email_Str_Ele);

        //Step 13:Enter Password
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.pass_Txt, "Softweb#123"), "Unable to Enter Password");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Password", "Enter Password");

        //Step 14:Click on Next Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.Next_Btn), "Unable to Click on Next Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Next Button", "Click on Next Button");

        Thread.sleep(3000);
        //Step 15:Select Basic Plan
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.basic_Plan), "Unable to Select Basic Plan");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Basic Plan", "Select Basic Plan");

/*
        //Step 16:Enter Card Name
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.cardName_Txt, companyUserPO.cardHolderNameStr), "Unable to Enter Card Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Card Name", "Test Data: "+companyUserPO.cardHolderNameStr);
        companyUserPO.switchFrame();

        //Step 17:Enter Card Number
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.cardNumber_Txt, companyUserPO.cardNumberStr), "Unable to Enter Card Number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Card Number", "Test Data: "+companyUserPO.cardNumberStr);

        //Step 18:Enter Card Exp Date
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.cardExpDate_Txt, companyUserPO.expDateStr), "Unable to Enter Card Exp Date");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Card Exp Date", "Test Data: "+companyUserPO.expDateStr);

        //Step 19:Enter Card CVV
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.cardCVV_Txt, companyUserPO.cvcCodeStr), "Unable to Enter Card CVV");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Card CVV", "Test Data: "+companyUserPO.cvcCodeStr);

        //Step 20:Enter Card Post
        Assert.assertTrue(commonMethods.enterTextInInputField(companyUserPO.cardPostal_Txt, companyUserPO.zipStr), "Unable to Enter Card Post");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Card Post", "Test Data: "+companyUserPO.zipStr);

        commonMethods.switchToDefaultContent();
*/

        //Step 21:Click on Confirm Button
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(companyUserPO.confirm_Btn), "Unable to Click on Confirm Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Confirm Button", "Click on Confirm Button");
        Thread.sleep(10000);

    }
}
