package testApp;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;

public class BasicTest{
    private AppiumDriver driver;

    @Before
    public void before() throws MalformedURLException {
        System.out.println("Iniciando Conexion Todo apk.....");

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","LG.G5");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test
    public void myfirstTest(){

        //  Action + Cual elemento? + En Donde esta el Elemento
        //  Click on [Login] Button in Login Page

        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();  //

        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("one title");
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("one note");
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();


        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click(); //

        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("one title");
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("two note");
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

        int cant =this.driver.findElements(By.id("com.vrproductiveapps.whendo:id/notesList")).size();
        System.out.println("Cantidad de tareas" + cant);


        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/search")).click();
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/search_src_text")).sendKeys("one"+ "\\n");
        int tasks= this.driver  .findElements(By.xpath("//*[contains(@resource-id,'search_list_item_text') and contains(@text,'one')] ")).size() ;
        System.out.println(" Cant found task: " +  tasks   );


    }

    @After
    public void after(){
        System.out.println("AFTER.....");
        try {
            Thread.sleep(5555);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.driver.quit();
    }

}
