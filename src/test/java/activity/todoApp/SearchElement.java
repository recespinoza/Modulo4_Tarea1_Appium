package activity.todoApp;
import appiumControl.Element;
import appiumControl.Label;
import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class SearchElement {

    public Button searchButton;
    public TextBox searchText;
    public Element searchItem;

    public SearchElement(String item) throws MalformedURLException {
        searchButton = new Button(By.id("com.vrproductiveapps.whendo:id/search"));
        searchText= new TextBox(By.id("com.vrproductiveapps.whendo:id/search_src_text"));
        searchItem = new Element(By.xpath("//*[contains(@resource-id,'search_list_item_text')  and contains(@text,' "+ item +" ')]" ));

    }
/*
    public void searchItem(String item ) throws MalformedURLException {
        searchItem = new Element(By.xpath("//*[contains(@resource-id,'search_list_item_text')  and contains(@text,' "+ item +" ')]" ));
        //searchElement.

    } */
    public int countElements(){
        System.out.println("Lista elementos: " + searchItem.getElements().size());

        return searchItem.getElements().size()/2;
    }



}
