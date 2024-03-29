package com.shikshalokam.pages.objects;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class ChromeObjects {


    @FindBy(id = "com.android.chrome:id/search_box_text")
    public MobileElement searchBox;

    @FindBy(xpath = " //android.view.View[@content-desc=\"Start Observation\"]/android.widget.Button")
    public MobileElement startObservation;

    @FindBy(xpath = " //android.view.View[@content-desc=\"Start project\"]/android.widget.Button")
    public MobileElement startProject;


}
