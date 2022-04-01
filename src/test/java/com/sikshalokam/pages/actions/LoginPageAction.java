package com.sikshalokam.pages.actions;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.utils.logger.Logger;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {


    LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPageAction() throws Exception {
        PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), loginPageObjects);
    }

    // switch to webview for inspect elements
    public void switchToWebView() throws Exception {
        Thread.sleep(5000);
        SikshaLokamClient.get().gestures().changeDriverContextToWeb(SikshaLokamClient.get().driver());
    }

    // enter user name to field.
    public void enterUserName(String userName) throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.userName);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.userName, userName);
    }

    // enter password to field.
    public void enterPassword(String password) throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.password);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.password, password);
    }

    public void clickOnLoginButton() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.loginButton);

    }

    public void verifyHomePage() throws Exception {
        Thread.sleep(6000);
        SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.programs);
        Logger.logAndReportPass("HomePage Welcome title is displayed succesfully.");
    }


    public void clickOnEnglish() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.englishLanguageOption);
        Logger.logAndReportInfo("Clicked on English language");
    }

    public void clickOnContinue() throws Exception {
        loginPageObjects.continueButton.click();
        //SikshaLokamClient.get().gestures().click(loginPageObjects.continueButton);
        Logger.logAndReportInfo("Clicked on the continue button ");
    }

    public void clickOnHeadTeacherOption() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.headTeacherOption);
        Logger.logAndReportInfo("Clicked on head teacher option");
    }

    public void clickOnLoginWithDikshaOption() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.loginWithDiksha);
        Logger.logAndReportInfo("Clicked on login button with diksha option");
    }

    public void clickonRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.registerButton);
        Logger.logAndReportInfo("clicked on register button.");
    }

    public void clickOnSelectYearOfBirthDropDwn() throws Exception {
        Thread.sleep(3000);
        SikshaLokamClient.get().gestures().click(loginPageObjects.yearOfBirthDropDwn);
        Logger.logAndReportInfo("clicked on select year of birth dropdown");

    }

    public void selectYearOfBirthOption() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectYear2021);
        Logger.logAndReportInfo("Year of Birth option is selected.");
    }

    public void clickOnTermsAndConditionToRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.termsAndConditionCheckBox);
        Logger.logAndReportInfo("Clicked on the terms and conditions checkbox");
        Thread.sleep(5000);
    }

    public void clickOnSubmitButtonToRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonToRegister);
        Logger.logAndReportInfo("Clicked on the submit button on register page ");
    }

    public void verifyFormNameFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.nameToRegister);
        if (state)
            Logger.logAndReportInfo("Form Name is Enabled.");
        else
            Logger.logAndReportInfo("Form Name is Disabled.");
    }

    public void verifyMobileNumbaerFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.mobileNumberToRegister);
        if (state)
            Logger.logAndReportInfo("Mobile Number field is Enabled.");
        else
            Logger.logAndReportInfo("Mobile Number field is Disabled.");
    }

    public void verifyPasswordFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.passwordToRegister);
        if (state)
            Logger.logAndReportInfo("Password field is Enabled.");
        else
            Logger.logAndReportInfo("Password field is Disabled.");
    }

    public void verifyConfirmPasswordFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.confirmPasswordToRegister);
        if (state)
            Logger.logAndReportInfo("Confirm Password field is Enabled.");
        else
            Logger.logAndReportInfo("Confirm Password field is Disabled.");
    }

    public void verifySubmitFieldEnabled() throws Exception {
        boolean state = SikshaLokamClient.get().gestures().isEnabled(loginPageObjects.submitButtonToRegister);
        if (state)
            Logger.logAndReportInfo("Submit Button is Enabled.");
        else
            Logger.logAndReportInfo("Submit Button is Disabled.");
        Thread.sleep(20000);
    }

    public void verifyRegisterPageFields() throws Exception {
        verifyFormNameFieldEnabled();
        verifyMobileNumbaerFieldEnabled();
        verifyPasswordFieldEnabled();
        verifyConfirmPasswordFieldEnabled();
    }

    // enter name to register form
    public void enterNameForRegister(String userName) throws Exception {
        // SikshaLokamClient.get().gestures().click(loginPageObjects.nameToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.nameToRegister, userName);
        Logger.logAndReportInfo("entered name for registration form : " + userName);
    }

    // enter mobile number to register form
    public void enterMobileNumberForRegister(String mobileNumber) throws Exception {
        loginPageObjects.mobileNumberToRegister.click();
        SikshaLokamClient.get().gestures().sendInteger(mobileNumber);


//        SikshaLokamClient.get().gestures().click(loginPageObjects.mobileNumberToRegister);
//
//        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.mobileNumberToRegister, mobileNumber);
//        Thread.sleep(15000);
//        Logger.logAndReportInfo("entered mobile number for registration form : " + mobileNumber);
//        Thread.sleep(15000);
//        System.out.println("10 sec wait completed");
    }

    // enter password to register form
    public void enterPasswordForRegister(String password) throws Exception {
        //SikshaLokamClient.get().gestures().click(loginPageObjects.passwordToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.passwordToRegister, password);
        Logger.logAndReportInfo("entered password for registration form : " + password);
    }

    // enter confirm password to register form
    public void enterConfirmPasswordForRegister(String confirmPassword) throws Exception {
        //SikshaLokamClient.get().gestures().click(loginPageObjects.confirmPasswordToRegister);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.confirmPasswordToRegister, confirmPassword);
        Logger.logAndReportInfo("entered confirm password for registration form : " + confirmPassword);
    }

}
