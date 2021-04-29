import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class SEPSAppiumTest2 {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "android.example.seps");
        dc.setCapability("appActivity", ".MainActivity");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.1:4723/wd/hub"), dc);
        MobileElement el3 = (MobileElement) driver.findElementById("android.example.seps:id/emailEtLogin");
        el3.sendKeys("nprouser@seps.com");
        Assert.assertEquals(driver.findElementById("android.example.seps:id/emailEtLogin").getText(), "nprouser@seps.com");
        MobileElement el4 = (MobileElement) driver.findElementById("android.example.seps:id/passwordEtLogin");
        el4.sendKeys("Erk*123");
        //Assert.assertEquals(driver.findElementById("android.example.seps:id/passwordEtLogin").getText(), "Erk*123");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout");
        el5.clear();
        MobileElement el6 = (MobileElement) driver.findElementById("android.example.seps:id/loginBtn");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Create Event\"]/android.widget.ImageView");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("14 April 2021");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("android.example.seps:id/editTextNewEventName");
        el9.sendKeys("WeddingEvent");
        MobileElement el10 = (MobileElement) driver.findElementById("android.example.seps:id/editTextNewEventPlace");
        el10.sendKeys("CebeciAnkara");
        MobileElement el11 = (MobileElement) driver.findElementById("android.example.seps:id/submit_button");
        el11.click();

        MobileElement el12 = (MobileElement) driver.findElementById("android.example.seps:id/uploadBtn");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/com.android.internal.widget.ViewPager/android.widget.RelativeLayout/com.android.internal.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementById("com.google.android.apps.photos:id/image");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Photo taken on Apr 25, 2021 5:54:38 PM");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementById("android.example.seps:id/CropOverlayView");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementById("android.example.seps:id/crop_image_menu_crop");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementById("android.example.seps:id/allPhotosButton");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementById("android.example.seps:id/likePh");
        el19.click();
        driver.navigate().back();
        driver.navigate().back();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"My Events\"]/android.view.ViewGroup");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Join Event\"]/android.view.ViewGroup/android.widget.TextView");
        el21.click();
        driver.navigate().back();
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Create Event\"]/android.view.ViewGroup/android.widget.TextView");
        el22.click();
        //(new TouchAction(driver)).tap(1417, 2021).perform();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementById("android.example.seps:id/logout");
        el24.click();
    }
}
