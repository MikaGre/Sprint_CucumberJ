package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class MyProfilePage extends BasePage {
  By fNameLocator = By.className("//span[@class='firstName']");
  By lNameLocator = By.className("//span[@class='lastName']");
  String detail = null;
  By profileDetailLocator = By.xpath("//label[contains(text(),'" + detail + "')]");

  public String getDetail(String detail){
     return getTextFromElement(profileDetailLocator);
  }
  public String getHeaderName() {
    String fName = getTextFromElement(fNameLocator);
    String lName = getTextFromElement(lNameLocator);
    return fName + " " + lName;
  }
}
