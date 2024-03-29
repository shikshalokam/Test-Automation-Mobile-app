package com.shikshalokam.test;

import java.util.Map;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.actions.HomePageActions;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ProfilePageActions;
import com.shikshalokam.utils.gSheet.TestData;


public class LoginPageTest {

    Map<String, String> loginPageTestData;
    String nameForCredential;
    String dateOfBirth;
    String mobileNumber;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    public HomePageActions getHomePageActions() throws Exception {
        return new HomePageActions();
    }
    public ProfilePageActions getProfilePageActions() throws Exception {
        return new ProfilePageActions();
    }

    @Test(description = "login to application with invalid Credentials")
    @Author(name = "Sunil H N")
    public void InvalidCredentialsLogin() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("InValidPassword"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyLoginFailedErrorMsg();

    }


    @Test(description = "login to application with invalid Credentials")
    @Author(name = "Sunil H N")
    public void loginToApplicationWithInvalidCred() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        Thread.sleep(10000);
        System.out.println("waiting 10 secs");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("InValidPassword"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyLoginFailedErrorMsg();


    }

    @Test(description = "register application")
    @Author(name = "Manjunath Kumar")
    public void OldCReleaseregistration() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().clickonRegister();
        getLoginPageActions().verifyRegisterPageFields();
        getLoginPageActions().clickOnSelectYearOfBirthDropDwn();
        getLoginPageActions().selectYearOfBirthOption();
        getLoginPageActions().verifyRegisterPageFields();
        nameForCredential = loginPageTestData.get("nameForRegister") + RandomStringUtils.randomAlphabetic(3);
        getLoginPageActions().enterNameForRegister(nameForCredential); //if name should be unique - need to add random alphabets or numbers
        mobileNumber = loginPageTestData.get("randomMobileNo") + RandomStringUtils.randomNumeric(5);
        getLoginPageActions().enterMobileNumberForRegister(mobileNumber);
        getLoginPageActions().swipeUpToConfirmPassword();
        //getLoginPageActions().enterMobileNumberForRegister("9998887771");
        getLoginPageActions().enterPasswordForRegister(loginPageTestData.get("passwordForRegister"));
        getLoginPageActions().enterConfirmPasswordForRegister(loginPageTestData.get("confirmPasswordForRegister"));
        getLoginPageActions().clickOnTermsAndConditionToRegister();
        getLoginPageActions().verifySubmitFieldEnabled();
        getLoginPageActions().clickOnSubmitButtonToRegister();
        Thread.sleep(5000);
        ShikshaLokamClient.get().getScreenShot().screenshot();
    }


    @Test(description = "register application and check fields")
    @Author(name="Manjunath Kumar")
    public void registration() throws Exception {

    	loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().clickonRegister();
    	//getLoginPageActions().verifyRegisterPageTitle();
        nameForCredential = loginPageTestData.get("nameForRegister") + RandomStringUtils.randomAlphabetic(3);
        getLoginPageActions().enterNameForRegister(nameForCredential); //if name should be unique - need to add random alphabets or numbers
        getLoginPageActions().enterDOBForRegister(loginPageTestData.get("dateOfBirth"));
        getLoginPageActions().clickOnContinueButtonForRegistration();
        getLoginPageActions().verifyContentForRegister();
       // getLoginPageActions().clickOnRoleToRegisterDropdwn(); not available in preprod
       // getLoginPageActions().selectHTAndOfficialRoleToRegister();
        getLoginPageActions().clickOnStateToRegisterDropdwn();
        getLoginPageActions().swipeUpToUttarPradeshState();
        getLoginPageActions().selectUttarPradeshStateToRegister();
       // getLoginPageActions().clickOnsubRoleToRegister();
       // getLoginPageActions().selectHMSubRoletoRegister();
        getLoginPageActions().clickOnDistictToRegisterDropdwn();
        getLoginPageActions().selectAgraDistrictToRegister();
        getLoginPageActions().clickOnSubmitButtonToContentSubmission();
        mobileNumber = loginPageTestData.get("randomMobileNo") + RandomStringUtils.randomNumeric(5);
        getLoginPageActions().enterMobileNumberForRegister(mobileNumber);
        getLoginPageActions().enterPasswordForRegister(loginPageTestData.get("passwordForRegister"));
        getLoginPageActions().enterConfirmPasswordForRegister(loginPageTestData.get("confirmPasswordForRegister"));
        getLoginPageActions().clickOnSubmitButtonToRegister();
        Thread.sleep(5000);
        getLoginPageActions().verifyOtpPage();
    }

    @Test(description = "register application and check fields")
    @Author(name="Manjunath Kumar")
    public void stagingRegistration() throws Exception {

    	loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().clickonRegister();
    	//getLoginPageActions().verifyRegisterPageTitle();
        nameForCredential = loginPageTestData.get("nameForRegister") + RandomStringUtils.randomAlphabetic(3);
        getLoginPageActions().enterNameForRegister(nameForCredential); //if name should be unique - need to add random alphabets or numbers
        getLoginPageActions().enterDOBForRegister(loginPageTestData.get("dateOfBirth"));
        getLoginPageActions().clickOnContinueButtonForRegistration();
        getLoginPageActions().verifyContentForRegister();
        getLoginPageActions().clickOnRoleToRegisterDropdwn();// not available in preprod
        getLoginPageActions().selectHTAndOfficialRoleToRegister();
        getLoginPageActions().clickOnStateToRegisterDropdwn();
        getLoginPageActions().swipeUpToUttarPradeshState();
        getLoginPageActions().selectUttarPradeshStateToRegister();
        getLoginPageActions().clickOnsubRoleToRegister();
        getLoginPageActions().selectHMSubRoletoRegister();
        getLoginPageActions().clickOnDistictToRegisterDropdwn();
        getLoginPageActions().selectAgraDistrictToRegister();
        getLoginPageActions().clickOnSubmitButtonToContentSubmission();
        mobileNumber = loginPageTestData.get("randomMobileNo") + RandomStringUtils.randomNumeric(5);
        getLoginPageActions().enterMobileNumberForRegister(mobileNumber);
        getLoginPageActions().enterPasswordForRegister(loginPageTestData.get("passwordForRegister"));
        getLoginPageActions().enterConfirmPasswordForRegister(loginPageTestData.get("confirmPasswordForRegister"));
        getLoginPageActions().clickOnSubmitButtonToRegister();
        Thread.sleep(5000);
        getLoginPageActions().verifyOtpPage();
    }


    //--------------------------New Sanity Scripts--------------------------------//

    @Test(description = "login to application")
    @Author(name = "Manjunath Kumar")
    public void loginToApplication() throws Exception {
   	    loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
        getLoginPageActions().userOnBoardingAsHTOfficial();
        getLoginPageActions().enterUserName(loginPageTestData.get("userHT"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyHomePage();

    }
    @Test(description = "login to application as 'HT & Officials' and verify all the tiles available on home page")
    @Author(name = "Manjunath Kumar")
    public void htloginAndVerifyAllTiles() throws Exception {
    	loginToApplication();
    	getLoginPageActions().verifyProgramsTile();
    	getLoginPageActions().verifyProjectsTile();
    	getLoginPageActions().verifyObservationsTile();
    	getLoginPageActions().verifySurveyTile();
    	getLoginPageActions().verifyCoursesTile();
    	getLoginPageActions().verifyReportsTile();

   }

    @Test(description = "login to application as 'Teacher'and verify all the tiles available on home page")
    @Author(name = "SHREEJITH")
    public void teacherloginAndVerifyAllTiles() throws Exception {
    	   loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!D:E");
           getLoginPageActions().userOnBoardingAsHTOfficial();
           getLoginPageActions().enterUserName(loginPageTestData.get("userTeacher"));
           getLoginPageActions().enterPassword(loginPageTestData.get("passwordTeacher"));
           getLoginPageActions().clickOnLoginButton();
           getHomePageActions().navigatingToTeacherHomePage();
           getHomePageActions().scrollToBrowseOtherCategories();
           getLoginPageActions().verifyProgramsTile();
           getLoginPageActions().verifyProjectsTile();
       	   getLoginPageActions().verifyObservationsTile();
   }


}