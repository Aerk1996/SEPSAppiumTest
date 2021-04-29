import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class SEPSAppiumTest {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","android.example.seps");
        dc.setCapability("appActivity",".MainActivity");




        AndroidDriver<AndroidElement> androd = new AndroidDriver<AndroidElement>(new URL("http://127.0.1:4723/wd/hub"),dc);

        MobileElement el4 = (MobileElement) androd.findElementById("android.example.seps:id/signUpLogin");
        el4.click();

        MobileElement el6 = (MobileElement) androd.findElementById("android.example.seps:id/usernameEtRegister");
        el6.click();
        el6.sendKeys("Ankaragucu1910");
        Assert.assertEquals(androd.findElementById("android.example.seps:id/usernameEtRegister").getText(),"Ankaragucu1910");

        MobileElement el7 = (MobileElement) androd.findElementById("android.example.seps:id/emailEtRegister");
        el7.click();
        el7.sendKeys("testertestedtesting@seps.com");
        Assert.assertEquals(androd.findElementById("android.example.seps:id/emailEtRegister").getText(),"testertestedtesting@seps.com");

        MobileElement el8 = (MobileElement) androd.findElementById("android.example.seps:id/passwordEtRegister");
        el8.click();
        el8.sendKeys("TestUser*123");
        Assert.assertEquals(androd.findElementById("android.example.seps:id/passwordEtRegister").getText(),"TestUser*123");

        MobileElement el9 = (MobileElement) androd.findElementById("android.example.seps:id/checkBox");
        el9.click();
        MobileElement el10 = (MobileElement) androd.findElementById("android.example.seps:id/regBtn");
        el10.click();

        //MobileElement el11 = (MobileElement) androd.findElementById("android.example.seps:id/signUpLogin");
        //el11.click();
        //MobileElement el12 = (MobileElement) androd.findElementById("android.example.seps:id/signInTxt");
        //el12.click();
        MobileElement el13 = (MobileElement) androd.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Create Event\"]/android.widget.ImageView");
        el13.click();
        MobileElement el14 = (MobileElement) androd.findElementByAccessibilityId("15 May 2021");
        el14.click();

        MobileElement el15 = (MobileElement) androd.findElementById("android.example.seps:id/editTextNewEventName");
        el15.sendKeys("AutomatedTestEvent");
        MobileElement el16 = (MobileElement) androd.findElementById("android.example.seps:id/editTextNewEventPlace");
        el16.sendKeys("Ankara");
        MobileElement el17 = (MobileElement) androd.findElementById("android.example.seps:id/submit_button");
        el17.click();

        MobileElement el18 = (MobileElement) androd.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"My Events\"]/android.widget.ImageView");
        el8.click();
        MobileElement el19 = (MobileElement) androd.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Join Event\"]/android.view.ViewGroup");
        el19.click();


    }
}
