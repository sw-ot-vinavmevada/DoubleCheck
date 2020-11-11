package TestCases.Login.AdminLogin;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AdminLoginPO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaterQualityAdminLoginTC extends BaseTest {

    int Flag = 1;
    public WaterQualityAdminLoginTC(WebDriver driver, int flag){
        this.driver =driver;
        this.Flag = flag;
    }

    @Test
    public void verifyLogin() throws Exception {

        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Smart Water Quality solution Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Water Quality Solution");
            log.info("Test Case Started");
        }

        CommonMethods commonMethods = new CommonMethods(driver);
        AdminLoginPO adminLoginPO = new AdminLoginPO(driver);


        //Step 1: Open URL
        Assert.assertTrue(commonMethods.openUrl(adminLoginPO.waterQualityUrl), "Unable to Open End User URL");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Browser should get open and should provide Admin User URL", "Browser got redirected to the Admin User Login page");

        //Step 2: Login in Admin Panel
        Assert.assertTrue(adminLoginPO.loginInAdmin(),"Unable to Login in Water Quality Admin Panel");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Water Quality Admin User should get logged in Application","Water Quality Admin got successfully logged in application");
        Thread.sleep(3000);

    }
}
