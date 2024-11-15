import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPages;
import pages.SearchPages;


import static com.codeborne.selenide.Selenide.open;


public class LoginTest {
    @BeforeTest
    public static void setup() {

        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";

    }

    @Test

    public void LoginTest1() {
        open("https://www.akakce.com/");

        LoginPages loginPages = new LoginPages();
        SearchPages searchPages = new SearchPages();

        loginPages.openLogin();
        loginPages.loginform("wvsxpdcujx@gumglue.app", "Aa!123456");

        searchPages.searchproduct("Stanley");
        searchPages.selectproduct();

        searchPages.Followproduct();


        }
    }

