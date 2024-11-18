package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPages extends LoginPages {

    private final SelenideElement searchbox =$x("//input[@id='q']");
    private final SelenideElement searchbutton = $x("//button[@title='Ara']");
    private final SelenideElement product = $x("//li[@data-mk='Stanley' and @data-pr='1343650']//h3[@class='pn_v8']");
    private final SelenideElement followbutton =$x("//div[@id='ntf_w']//span[@class='ufo_v8']");


    public void searchproduct(String text){
        searchbox.setValue(text);
        searchbutton.click();

    }

    public void selectproduct(){
        product.shouldBe(visible).click();
    }

    public void followproduct(){
        followbutton.shouldBe(visible).click();

    }


}
