package pages;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPages extends LoginPages {

    private SelenideElement searchbox =$x("//input[@id='q']");
    private SelenideElement searchbutton = $x("//button[@title='Ara']");
    private SelenideElement product = $x("//li[@data-mk='Stanley' and @data-pr='1343650']//h3[@class='pn_v8']");
    private SelenideElement followbutton =$x("//div[@id='ntf_w']//span[@class='ufo_v8 a']");


    public void searchproduct(String text){
        searchbox.setValue(text);
        searchbutton.click();

    }

    public void selectproduct(){
        product.shouldBe(visible).click();
    }

    public void Followproduct(){
        followbutton.shouldBe(visible).click();

    }


}
