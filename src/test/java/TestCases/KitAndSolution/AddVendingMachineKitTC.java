package TestCases.KitAndSolution;

import BasePackage.BaseTest;
import BasePackage.CommonMethods;
import BasePackage.ExtentReport.ExtentTestManager;
import PageObjects.AddBuildingPO;
import PageObjects.AddElevatorPO;
import TestCases.AddBuilding.AddAirQualityFacilitiesTC;
import TestCases.AddBuilding.AddVendingLocationTC;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddVendingMachineKitTC extends BaseTest {

    int Flag = 1;



  /*  public AddBuildingTC(WebDriver driver, int flag) {
        this.driver = driver;
        this.Flag = flag;
    }*/


    @Test
    public void verifyToAddVendingMachine() throws Exception {
        if (Flag > 0) {
            ExtentTestManager.getTest().getTest().setName("Add Vending Machine Test Started");
            ExtentTestManager.getTest().assignCategory("Smart Vending Machine Solution");
            log.info("Bind Hardware kit With Location Test Started");
        }

        //Pre-Condition:- Add Location
        AddVendingLocationTC addVendingLocationTC = new AddVendingLocationTC(driver,1);
        addVendingLocationTC.verifyCreateLocation_VendingMachine();


        CommonMethods commonMethods = new CommonMethods(driver);
        AddElevatorPO addElevatorPO = new AddElevatorPO(driver);
        AddBuildingPO addBuildingPO = new AddBuildingPO(driver);

        Thread.sleep(6000);
        //Step 1:Click on Vending Machine Icon
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.vendingM_Icon), "Unable to Click on Vending Machine Icon");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Location Icon", "User should be redirected to Create Location Page");

        Thread.sleep(6000);
        //Step 2:Click on Add Vending Button
        Assert.assertTrue(commonMethods.clickByJS(addElevatorPO.addVending_Btn), "Unable to Click on Add Vending Button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add Sensor Button", "Click on Add Vending Button");

        //Step 3:Select Location Name
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.location_DD,addElevatorPO.location_Value), "Unable to Select Location Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Location Name", "Test Data: "+addBuildingPO.locationName);

        //Step 4:Enter Kit Code
       // Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.kitCode_Txt,addElevatorPO.hwID), "Unable to Enter Kit Code");
       // ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Kit Code", "Test Data: "+addElevatorPO.hwID);

        //Step 5:Enter Machine ID
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.uID_Txt_VM,addElevatorPO.udID+"Vending"), "Unable to Enter Machine ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Machine ID", "Test Data: "+addElevatorPO.udID+"Vending");

        //Step 6:Enter Vending Name
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.vendingName_Txt,addElevatorPO.vendingName), "Unable to Enter Sensor Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Sensor Name", "Test Data: "+addElevatorPO.vendingName);

        //Step 7:Select Product Type1
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.productType_DD,addElevatorPO.productType_Value), "Unable to Select Product Type One");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Product Type1", "Product Type One Selected:");

        //Step 8:Select Product Type2
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.productType_DD1,addElevatorPO.productType_Value1), "Unable to Select Product Type Two");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Product Type2", "Product Type Two Selected:");

        //Step 9:Select Product Type3
        Assert.assertTrue(commonMethods.selectFromDropDown(addElevatorPO.productType_DD2,addElevatorPO.productType_Value2), "Unable to Select Product Type Three");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select Product Type3", "Product Type Three Selected:");

        //Step 10:Enter SelfID 1
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.shelfId_Txt,addElevatorPO.shelfId), "Unable to Enter Shelf ID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Shelf ID", "Test Data:"+addElevatorPO.shelfId1);

        //Step 11:Enter SelfID 2
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.shelfId_Txt1,addElevatorPO.shelfId1), "Unable to Enter Shelf ID1");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Shelf ID1", "Test Data:"+addElevatorPO.shelfId2);

        //Step 12:Enter SelfID 3
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.shelfId_Txt2,addElevatorPO.shelfId2), "Unable to Enter Shelf ID2");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Shelf ID2", "Test Data:"+addElevatorPO.shelfId2);

        //Step 13:Enter Shelf Capacity 1
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.shelfCapacity_Txt,addElevatorPO.shelfCapacity), "Unable to Enter Shelf Capacity1");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Shelf Capacity1", "Test Data: "+addElevatorPO.shelfCapacity);

        //Step 14:Enter Shelf Capacity 2
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.shelfCapacity_Txt1,addElevatorPO.shelfCapacity), "Unable to Enter Shelf Capacity2");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Shelf Capacity2", "Test Data: "+addElevatorPO.shelfCapacity);

        //Step 15:Enter Shelf Capacity 3
        Assert.assertTrue(commonMethods.enterTextInInputField(addElevatorPO.shelfCapacity_Txt2,addElevatorPO.shelfCapacity), "Unable to Enter Shelf Capacity3");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter Shelf Capacity3", "Test Data: "+addElevatorPO.shelfCapacity);

        //Step 16:Click On Submit
        Assert.assertTrue(commonMethods.clickOnLinkOrButton(addElevatorPO.submit1_Btn), "Unable to Click On Submit");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click On Submit", "Click On Submit");
 }
}
