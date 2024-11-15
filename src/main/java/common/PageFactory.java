package common;


import pages.LoginPages;


public class PageFactory {

    public static LoginPages buildLoginPage() {
        return new LoginPages();
    }

}