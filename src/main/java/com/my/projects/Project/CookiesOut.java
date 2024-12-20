package com.my.projects.Project;

import com.my.projects.Pages.CookieBanner_1;
import com.my.projects.Pages.CookieBanner_2;
import com.my.projects.Pages.CookieBanner_3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CookiesOut {


    private WebDriver driver;
    private CookieBanner_1 cb1;
    private CookieBanner_2 cb2;
    private CookieBanner_3 cb3;

    @BeforeEach
public void Before() {

        String url = "https://www.google.com/";
        try {
            driver = new ChromeDriver();

            cb1 = PageFactory.initElements(this.driver, CookieBanner_1.class);
            cb2 = PageFactory.initElements(this.driver, CookieBanner_2.class);
            cb3 = PageFactory.initElements(this.driver, CookieBanner_3.class);


            driver.manage().window().maximize();
            driver.get(url);
        } catch (SessionNotCreatedException e) {
            System.out.println("Session not created, trying again");
            Before();
        }
    }

//Infinite loop checks if there is any type of cookies while browsing
//Solves >>> https://www.kdomivolal.eu/
//Solves >>> https://www.mediafire.com/download/gp00z1oqvlmc4pr
//Solves (WIP) >>> https://icon-icons.com/search/icons/?filtro=google+chrome
    @Test
    public void RemoveCookiesLoop() {
        while (true) {
        try{
    CookiesOut_1();
}catch(Exception e){
    try{
            CookiesOut_2();
    }    catch(Exception e1){
        try{
            CookiesOut_3();
        } catch (Exception e2) {
            RemoveCookiesLoop();
        }
      }
    }
  }
}


//For >>> CookieBanner_1
    public void CookiesOut_1(){
        cb1.cookiesOptions();
        CookieBanner_1.buttonsLoop();
        //CookieBanner_1.noButtonsCheckedAssertion();
        cb1.moreCookiesOptions();
        CookieBanner_1.buttonsLoop();
       // CookieBanner_1.noButtonsCheckedAssertion();
    }

//For >>> CookieBanner_2
    public void CookiesOut_2(){
        cb2.setManageSettings(cb2.manageSettings);
        CookieBanner_2.checkboxesLoop();
        CookieBanner_2.checkboxAssertion();
        cb2.setshowVendors(cb2.showVendors);
        CookieBanner_2.checkboxesLoop();
        CookieBanner_2.checkboxAssertion();
    }

//For >>> CookieBanner_3
    public void CookiesOut_3(){
        cb3.setManageSettings(cb3.manageSettings);
        CookieBanner_3.noButtonsCheckedAssertion();
        CookieBanner_3.SelectVendors();
        CookieBanner_3.noButtonsCheckedAssertionVendors();
        CookieBanner_3.LegitimateInterest();
        CookieBanner_3.ObjectToEverything();
    }
}
