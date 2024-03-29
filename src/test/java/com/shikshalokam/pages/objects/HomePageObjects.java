package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePageObjects {


    @FindBy(xpath = "//android.widget.Button[@text='Programs']")
    public WebElement programs;

    @FindBy(xpath = "//android.widget.Button[@text='Projects']")
    public WebElement projects;

    @FindBy(xpath = "//android.widget.Button[@text='Observation']")
    public WebElement observation;

    @FindBy(xpath = "//android.widget.Button[@text='Surveys']")
    public WebElement surveys;

    @FindBy(xpath = "//android.widget.Button[@text='Courses']")
    public WebElement courses;

    @FindBy(xpath = "(//android.view.View[@text='profile'])[1]")
    public WebElement profileMenu;

    @FindBy(xpath = "(//android.view.View[@text='home'])[1]")
    public WebElement homeMenu;

    @FindBy(xpath = "//android.widget.Button[@text='Collapsed']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//android.widget.TextView[@text='Try new SUNBIRD experience']")
    public WebElement tryNewSunbirdExperience;

  //android.widget.TextView[@text='Try new SUNBIRD experience']
  //android.widget.Button[@text='Collapsed']

    @FindBy(xpath = "//android.widget.Button[@text='SWITCH TO NEW EXPERIENCE']")
    public WebElement switchToNewExperience;

    //@FindBy(xpath = "(//android.view.View[@text='downloads'])[1]")
    @FindBy(xpath = "//android.widget.Image[@text='download']") // verify xpath
    public WebElement downloadsMenu;

    @FindBy(xpath="(//android.widget.TextView[@text='Downloads'])")
    public WebElement downloadsTitle;

    @FindBy(xpath="//android.widget.Button[contains(@text,'Delete')]")
    public WebElement deleteOption;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'No downloads')]")
    public WebElement NoDownloadsText;

    @FindBy(xpath = "(//android.view.View[@text='courses'])[1]")
    public WebElement coursesMenu;

    @FindBy(xpath = "//android.widget.Button[@text='notifications']")
    public WebElement notifications;

    @FindBy(xpath = "//android.widget.TextView[@text='Browse other categories']")
    public WebElement browseOtherCategorySection;


}
