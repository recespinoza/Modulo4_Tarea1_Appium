package activity.todoApp;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AddElement {
    public TextBox titleText;
    public TextBox notesText;
    public Button  saveButton;

    public AddElement(){
        titleText= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notesText= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }

}

