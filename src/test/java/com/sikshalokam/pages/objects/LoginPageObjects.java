package com.sikshalokam.pages.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {


    @FindBy(xpath="//android.widget.Button[contains(@text,'English')]")
    public MobileElement englishLanguageOption;

    @FindBy(xpath="//android.widget.Button[contains(@text,'Continue')]")
    public MobileElement continueButton;

    @FindBy(xpath="//android.widget.Button[contains(@text,'HT & Officials')]")
    // previously it was Head Teacher & Officials
    public MobileElement headTeacherOption;
    
    @FindBy(xpath="//android.widget.Button[contains(@text,'Teacher')]")
    // previously it was Head Teacher & Officials
    public MobileElement TeacherOption;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'Login to DIKSHA')]")
    public MobileElement loginPageTitle;
    
    @FindBy(xpath="//android.widget.Button[contains(@text,'Login with DIKSHA')]")
    public MobileElement loginWithDiksha;

    @FindBy(xpath="//span[text()=' English ']")
    public MobileElement englishOption;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"username\"]")
    public MobileElement userName;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"password\"]")
    public MobileElement password;

    @FindBy(xpath="//android.widget.Button[@resource-id=\"login\"]")
    public MobileElement loginButton;

    @FindBy(xpath="xpath=\"//android.widget.TextView[contains(@text,'Welcome')]")
    public MobileElement welcomeTitle;
    
    @FindBy(xpath="//android.view.View[@content-desc=\"Register here\"]/android.widget.TextView")
    public MobileElement registerButton;
    
    @FindBy(xpath="(//android.view.View[contains(@text,'Select year of birth')])[2]")
	public MobileElement yearOfBirthDropDwn;
    
    @FindBy(xpath="//android.widget.TextView[contains(@text,'2021')]")
    public MobileElement selectYear2021;
    
    @FindBy(xpath="//android.widget.EditText[@resource-id=\"signup-form-name\"]")
    public MobileElement nameToRegister;
    
    @FindBy(xpath="//android.widget.EditText[@resource-id='signup-form-phone']")
    public MobileElement mobileNumberToRegister;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"signup-form-password\"]")
    public MobileElement passwordToRegister;
    
    @FindBy(xpath="//android.widget.EditText[@resource-id=\"signup-form-confirmPassword\"]")
    public MobileElement confirmPasswordToRegister;
    
    @FindBy(xpath="//android.widget.Button[@resource-id=\"resetGoogleCaptcha\"]")
    public MobileElement submitButtonToRegister;
    
    @FindBy(xpath="//android.widget.CheckBox[@resource-id='tncAccepted']")
    public MobileElement termsAndConditionCheckBox;

    @FindBy(xpath = "//android.widget.Button[@text='Programs']")
    public MobileElement programs;
    
    //list of tiles on homepage
    @FindBy(xpath = "//android.widget.Button[@text='Programs']")
    public MobileElement programsTile;
    
    @FindBy(xpath = "//android.widget.Button[@text='Projects']")
    public MobileElement projectsTile;
    
    @FindBy(xpath = "//android.widget.Button[@text='Observation']")
    public MobileElement observationTile;
    
    @FindBy(xpath = "//android.widget.Button[@text='Surveys']")
    public MobileElement surveyTile;
    
    @FindBy(xpath = "//android.widget.Button[@text='Courses']")
    public MobileElement courseTile;
    
    @FindBy(xpath = "//android.widget.Button[@text='Reports']")
    public MobileElement reportsTile;
    
    @FindBy(xpath="//android.widget.TextView[@resource-id='error-summary']")
    public MobileElement loginErrorMsg;
    
    @FindBy(xpath = "//android.widget.TextView[@text='Programs']")
    public MobileElement programsTitle;
    
}