package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;



public class LoginPageObjects {
	/* public LoginPageAction getLoginPageActions() throws Exception {
	        return new LoginPageAction();
	    } */

	/* public LoginPageObjects() throws Exception {
        // Initialize page elements using Page Factory
       PageFactory.initElements(new AppiumFieldDecorator(SikshaLokamClient.get().driver()), this);

	} */
    @CacheLookup

	@FindBy(xpath="//android.widget.Button[contains(@text,'English')]")
    public  WebElement englishLanguageOption;

    @FindBy(xpath="//android.widget.Button[contains(@text,'Continue')]")
    public WebElement continueButton;

    @FindBy(xpath="//android.widget.Button[contains(@text,'HT & Officials')]")
    // previously it was Head Teacher & Officials
    public WebElement headTeacherOption;

    @FindBy(xpath="//android.widget.Button[contains(@text,'Teacher')]")
    // previously it was Head Teacher & Officials
    public WebElement TeacherOption;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'Selected Board')]")
    public WebElement selectBoardDropdown;

    @FindBy(xpath = "//android.widget.RadioButton[contains(@text,'CBSE/NCERT')]")
    public WebElement cbseRadioButton;

    @FindBy(xpath = "//android.widget.Button[contains(@text,'Submit')]")
    public WebElement submitButtonForBoarding;

    @FindBy(xpath = "(//android.view.View[contains(@text,'Select Medium')])[1]")
    public WebElement selectMedium;

    @FindBy(xpath = "//android.widget.CheckBox[contains(@text,'English')]")
    public WebElement englishMedium;

    @FindBy(xpath = "(//android.view.View[contains(@text,'Select Class')])[1]")
    public WebElement selectClass;

    @FindBy(xpath = "//android.widget.CheckBox[contains(@text,'Class 5')]")
    public WebElement class5;

    @FindBy(xpath="//android.widget.Button[contains(@text,'CONTINUE')]")
    public WebElement continueButtonForBoarding;

    @FindBy(xpath="//android.widget.Button[contains(@text,'SWITCH TO NEW EXPERIENCE')]")
    public WebElement switchToNewExperience;

    @FindBy(xpath="//android.widget.Button[contains(@text,'menu')]")
    public WebElement hambergerMenu;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'Login to DIKSHA')]")
    public WebElement loginPageTitle;

    @FindBy(xpath="//android.widget.Button[contains(@text,'Login with DIKSHA')]")
    public WebElement loginWithDiksha;

    @FindBy(xpath="//span[text()=' English ']")
    public WebElement englishOption;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"Email\"]")
    public WebElement userName;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"Password\"]")
    public WebElement password;

    @FindBy(xpath="//android.widget.Button[@text=\"LOGIN\"]")
    public WebElement loginButton;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'Welcome')]")
    public WebElement welcomeTitle;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'Register on DIKSHA')]")
    public WebElement registerPageTitle;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'To discover relevant')]")
    public WebElement contentToRegister;

    @FindBy(xpath="//android.view.View[@content-desc=\"Register here\"]/android.widget.TextView")
    public WebElement registerButton;

    @FindBy(xpath="(//android.view.View[contains(@text,'Select year of birth')])[2]")
	public WebElement yearOfBirthDropDwn;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'2021')]")
    public WebElement selectYear2021;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"signup-form-name\"]")
    public WebElement nameToRegister;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"mat-input-0\"]")
    public WebElement yearOfBirthToRegister;

    @FindBy(xpath = "//android.view.View[@text='1996']")
    public WebElement dateOfBirthYear;

    @FindBy(xpath="//android.widget.Button[contains(@text,'CONTINUE')]")
    public WebElement continueButtonForRegistration;

    @FindBy(xpath="//android.view.View[@resource-id='persona']")
    public WebElement roleToRegister;

    @FindAll({
    	@FindBy(xpath="//android.widget.TextView[@text='Head teacher & Official']"),
    	@FindBy(xpath="//android.view.View[@text='School head OR Officials']")
    })

//    @FindBy(xpath="//android.widget.TextView[@text='Head teacher & Official']")
    public WebElement HTAndOfficialRoleOption;

    @FindBy(xpath="//android.view.View[@resource-id='subPersona']")
    public WebElement subRoleToRegister;

    @FindBy(xpath="//android.widget.TextView[@text='HM']")
    public WebElement HMSubRoleOption;

    @FindBy(xpath="//android.view.View[@resource-id='state']")
    public WebElement stateToRegister;

    @FindBy(xpath="//android.widget.TextView[@text='Uttar Pradesh']")
    public WebElement selectUPStateToRegister;

    @FindBy(xpath="//android.widget.TextView[@text='Uttar Pradesh']")
    public WebElement selectAPStateToRegister;

    @FindBy(xpath="//android.view.View[@resource-id='district']")
    public WebElement districtToRegister;

    @FindBy(xpath="//android.widget.TextView[@text='AGRA']")
    public WebElement selectAgraDistrictToRegister;

    @FindBy(xpath="//android.widget.Button[contains(@text,'SUBMIT')]")
    public WebElement submitButtonForContentSubmission;

    @FindBy(xpath="//android.view.View[contains(@text,'One Time Password')]")
    public WebElement oneTimePasswordTitle;

    @FindBy(xpath="//android.widget.EditText[@resource-id='withphone']")
    public WebElement mobileNumberToRegister;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"signup-form-password\"]")
    public WebElement passwordToRegister;

    @FindBy(xpath="//android.widget.EditText[@resource-id=\"signup-form-confirmPassword\"]")
    public WebElement confirmPasswordToRegister;

    @FindBy(xpath="//android.widget.Button[@resource-id=\"resetGoogleCaptcha\"]")
    public WebElement submitButtonToRegister;

    @FindBy(xpath="//android.widget.CheckBox[@resource-id='tncAccepted']")
    public WebElement termsAndConditionCheckBox;

    @FindBy(xpath = "//android.widget.Button[@text='Programs']")
    public WebElement programs;

    //list of tiles on homepage
    @FindBy(xpath = "//android.widget.Button[@text='Programs']")
    public WebElement programsTile;

    @FindBy(xpath = "//android.widget.Button[@text='Projects']")
    public WebElement projectsTile;

    @FindBy(xpath = "//android.widget.Button[@text='Observations']")
    public WebElement observationsTile;

    @FindBy(xpath = "//android.widget.Button[@text='Surveys']")
    public WebElement surveyTile;

    @FindBy(xpath = "//android.widget.Button[@text='Courses']")
    public WebElement courseTile;

    @FindBy(xpath = "//android.widget.Button[@text='Reports']")
    public WebElement reportsTile;

    @FindBy(xpath="//android.widget.TextView[@resource-id='error-summary']")
    public WebElement loginErrorMsg;

    @FindBy(xpath = "//android.widget.TextView[@text='Programs']")
    public WebElement programsTitle;

/*	private WebElement  findElementByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	} */

}