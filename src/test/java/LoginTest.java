import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPages;
import pages.SearchPages;


import static com.codeborne.selenide.Selenide.open;


public class LoginTest{
    @BeforeTest
    public static void setup() {

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.akakce.com/");
    }

    @Test

    public void LoginTest1() {


        LoginPages loginPages = new LoginPages();

        loginPages.openLogin();
        loginPages.loginform("wvsxpdcujx@gumglue.app", "Aa!123456");
    }

    @Test

    public void SearchTest() {
        SearchPages searchPages = new SearchPages();

        searchPages.searchproduct("Stanley");
        searchPages.selectproduct();
    }

    @Test

     public void FollowTest(){
        SearchPages searchPages = new SearchPages();
        searchPages.followproduct();

     }
    }

