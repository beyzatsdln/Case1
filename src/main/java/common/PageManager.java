package common;

import driver.DriverFactory;

import pages.LoginPages;


public class PageManager {
    public LoginPages loginPages;


    public PageManager() {

        DriverFactory.initDriver();

        loginPages = PageFactory.buildLoginPage();




    }
}
