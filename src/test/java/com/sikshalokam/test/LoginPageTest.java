package com.sikshalokam.test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginPageTest {

    Map<String, String> loginPageTestData;
    String nameForCredential;
    String mobileNumber;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    @Test(description = "login to application")
    @Author(name = "Manjunath Kumar")
    public void loginToApplication() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnHeadTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyHomePage();

    }

    @Test(description = "login to application")
    @Author(name = "Manjunath Kumar")
    public void loginToApplicationAsTeacherPerson() throws Exception {
        loginPageTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTest!A:B");
        getLoginPageActions().clickOnEnglish();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnTeacherOption();
        getLoginPageActions().clickOnLoginWithDikshaOption();
        getLoginPageActions().enterUserName(loginPageTestData.get("userName"));
        getLoginPageActions().enterPassword(loginPageTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyHomePage();

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


    @Test(description = "login to application")
    @Author(name = "Sunil H N")
    public void loginToApplicationWithInvalidCred() throws Exception {
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

    @Test(description = "register application")
    @Author(name = "Manjunath Kumar")
    public void registration() throws Exception {
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
        SikshaLokamClient.get().getScreenShot().screenshot();
    }


}