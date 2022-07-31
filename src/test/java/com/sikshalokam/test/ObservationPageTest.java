package com.sikshalokam.test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageActions;
import com.sikshalokam.utils.gSheet.TestData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class ObservationPageTest {

    Map<String, String> loginPageTestData;
    Map<String, String> observationPageTestData;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    public ObservationPageActions getObservationPageActions() throws Exception {
        return new ObservationPageActions();
    }

    //@BeforeMethod
    public void loginToTheApplication() throws Exception {
        System.out.println("loginToTheApplication");
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();

    }


   // @Test(description = "Verify Observation is able to open")
    @Author(name = "Sunil H N")
    public void verifyObservationTabViaLink() throws Exception {
        WebElement e = SikshaLokamClient.get().driver().findElement(By.id("com.android.chrome:id/search_box_text"));
        e.click();
        Actions action = new Actions(SikshaLokamClient.get().driver());
        action.sendKeys("https://preprod.ntp.net.in/manage-learn/create-observation/2ba0cdc1284729331d296bf3ad118f5a").perform();
        Thread.sleep(3000);
        Thread.sleep(3000);
        SikshaLokamClient.get().driver().findElement(By.xpath("//android.view.View[@content-desc=\"Start Observation\"]/android.widget.Button")).click();
        Thread.sleep(6000);

    }

    //removed from execution list
    @Test(description = "Verify Observation is able to open")
    @Author(name = "Sunil H N")
    public void verifyObservationTab() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationTab();
        getObservationPageActions().verifyObservationTxt();

    }

    @Test(description = "Verify Entity List in Observation")
    @Author(name = "Sunil H N")
    public void VerifyObservationTabAndEntityList() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationTab();
        getObservationPageActions().verifyObservationTxt();
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getObservationPageActions().sendObservationNameToSearch(observationPageTestData.get("multpleRubricsObservationName"));
        getObservationPageActions().clickOnFirstObservation();
        getObservationPageActions().verifyAddEntityButton();
        getObservationPageActions().clickOnAddEntityButton();
        getObservationPageActions().verifyAddEntitySearchButton();
    }


    @Test(description = "Verify Observation")
    @Author(name = "Sunil H N")
    public void AddNewObservation() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationTab();
        getObservationPageActions().verifyObservationTxt();
        getObservationPageActions().sendObservationNameToSearch(observationPageTestData.get("observationNameToAddNewObservation"));
        Thread.sleep(5000);
        getObservationPageActions().clickOnFirstObservation();
        getObservationPageActions().clickOnFirstEntity();
        getObservationPageActions().verifyFirstObservationSubmission();
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().verifyNewObservationAdded();
        //cleanup steps for next run
        getObservationPageActions().clickOnSubmissionThreeDot();
        getObservationPageActions().clickOnDeleteSubmission();
        getObservationPageActions().clickOnSubmissionDeleteYesOption();
    }



    //TC_31,32,33
    @Test(description = "Search Observation via keyword and check not applicable option")
    @Author(name = "Manjunatha K")
    public void verifySearchingObservationviaKeywords() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationTab();
        getObservationPageActions().sendObservationNameToSearch(observationPageTestData.get("observationNameToSearch"));
        getObservationPageActions().verifySearchedObservation(observationPageTestData.get("observationNameToSearch"));

    }
}
