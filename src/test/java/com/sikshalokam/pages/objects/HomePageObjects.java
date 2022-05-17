package com.sikshalokam.pages.objects;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {


    @FindBy(xpath = "//android.widget.Button[@text='Programs']")
    public MobileElement programs;

    @FindBy(xpath = "//android.widget.Button[@text='Projects']")
    public MobileElement projects;

    @FindBy(xpath = "//android.widget.Button[@text='Observation']")
    public MobileElement observation;

    @FindBy(xpath = "//android.widget.Button[@text='Surveys']")
    public MobileElement surveys;

    @FindBy(xpath = "//android.widget.Button[@text='Courses']")
    public MobileElement courses;

    @FindBy(xpath = "(//android.view.View[@text='profile'])[1]")
    public MobileElement profileMenu;

    @FindBy(xpath = "(//android.view.View[@text='home'])[1]")
    public MobileElement homeMenu;

    //@FindBy(xpath = "(//android.view.View[@text='downloads'])[1]")
    @FindBy(xpath = "(//android.widget.Image)[4]") // verify xpath
    public MobileElement downloadsMenu;

    @FindBy(xpath="(//android.widget.TextView[@text='Downloads'])")
    public MobileElement downloadsTitle;
    
    @FindBy(xpath="//android.widget.Button[contains(@text,'Delete')]")
    public MobileElement deleteOption;
    
    @FindBy(xpath="//android.widget.TextView[contains(@text,'No downloads')]")
    public MobileElement NoDownloadsText;
    
    @FindBy(xpath = "(//android.view.View[@text='courses'])[1]")
    public MobileElement coursesMenu;

    @FindBy(xpath = "//android.widget.Button[@text='notifications']")
    public MobileElement notifications;


}
