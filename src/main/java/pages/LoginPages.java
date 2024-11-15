package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPages {

    private SelenideElement login = $x("//div[@id='H_rl_v8']//a[contains(text(),'Giriş Yap')]");
    private SelenideElement emailfield = $x("//input[@id='life']");
    private SelenideElement passwordfield = $x("//input[@id='lifp']");
    private SelenideElement loginbutton = $x("//input[@id='lfb']");


    public void openLogin(){
        login.shouldBe(visible).click();
    }

    public void loginform(String email, String password){

        emailfield.click();
        emailfield.shouldBe(visible).setValue(email);
        passwordfield.shouldBe(visible).setValue(password);
        loginbutton.click();

    }




}
