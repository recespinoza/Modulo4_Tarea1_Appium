package activity.todoApp;

import appiumControl.Button;
import org.openqa.selenium.By;

public class AddTask {
    public Button addButton;

    // this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();  //
    public AddTask(){
        addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    }
}
