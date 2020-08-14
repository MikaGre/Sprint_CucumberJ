package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class ListPage extends BasePage {
    By recommendList = By.xpath("//table[@class='item-list']");

    public int getAmt(){
      return getTotalElementsInList(recommendList);
    }

}
