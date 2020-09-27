package testApp;

import activity.todoApp.AddElement;
import activity.todoApp.AddTask;
import activity.todoApp.SearchElement;
import org.junit.After;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class TodoTaskTest {

    AddElement  addElement = new AddElement();
    AddTask     addTask = new AddTask();
    SearchElement   searchElement= null;

    @Test
    public void verifyAddElement () throws MalformedURLException {

        addTask.addButton.click();
        addElement.titleText.type("task android");
        addElement.notesText.type(" for android");
        addElement.saveButton.click();

        addTask.addButton.click();
        addElement.titleText.type("task ios");
        addElement.notesText.type(" for ios");
        addElement.saveButton.click();

        addTask.addButton.click();
        addElement.titleText.type("task linux");
        addElement.notesText.type(" for others");
        addElement.saveButton.click();

        searchElement = new SearchElement("linux");
        searchElement.searchButton.click();
        searchElement.searchText.typeEnter("linux");


        int valor=searchElement.countElements();
        System.out.println("Lista elementos: " + valor);
    }
/*
    @Test
    public void verifySearchElement () throws MalformedURLException {
        addTask.addButton.click();
        addElement.titleText.type("task 3");
        addElement.notesText.type("task for android");
        addElement.saveButton.click();

        addTask.addButton.click();
        addElement.titleText.type("task 3");
        addElement.notesText.type("task for ios");
        addElement.saveButton.click();

        searchElement.searchButton.click();
        searchElement.searchText.typeEnter("android");
    }
*/

    @After
    public void after() throws MalformedURLException {
        try {
            Thread.sleep(5555);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Session.getInstance().closeSession();
    }
}
