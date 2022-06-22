import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import java.net.MalformedURLException;
import java.net.URL;
public class Test {

    static AndroidDriver driver;
    private static String name = "ll59d4iv79";
    private static String password = "rcE6fnZtwMMHU.c";
    private static String phoneNumb = "1138979854";

    private static  TouchAction touchAction;

    public static void main(String[] args) {
        try {
            testSomething();
            eliminatePopUps();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void testSomething() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Emulated_64");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
//        capabilities.setCapability("appPackage", "com.android.chrome");
//        capabilities.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");
        capabilities.setCapability("appPackage", "com.shopee.ar");
        capabilities.setCapability("appActivity", "com.shopee.app.ui.home.HomeActivity_");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        touchAction=new TouchAction(driver);
        System.out.println("Appium driver initialized");

        String dontAllow = "com.android.permissioncontroller:id/permission_deny_button";
        String comenzarBtn = "com.shopee.ar:id/btn";
        String notAllowGeoBtn = "com.android.permissioncontroller:id/permission_deny_button";
        getBtn(dontAllow).click();
//        driver.findElement(By.id("android:id/ok")).click();
        timeLapse(5000);
        getBtn(comenzarBtn).click();
        timeLapse(7000);
        getBtn(notAllowGeoBtn).click();



        PointOption loginHomeBtn = PointOption.point(980, 1762);
        PointOption loginSettingBtn = PointOption.point(935, 1774);
        PointOption nameBtn = PointOption.point(265, 596);
        String nameField = "com.shopee.ar:id/cret_edit_text";
        PointOption passwordBtn = PointOption.point(233, 401);
        PointOption loginSubmitBtn = PointOption.point(523, 900);
        String passwordFieldxpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.EditText";

        System.out.println("1");
        performTap(loginHomeBtn);
        timeLapse(2000);
        System.out.println("1");
        performTap(loginSettingBtn);
        timeLapse(2000);
        System.out.println("2");
        performTap(nameBtn);
        timeLapse(3000);
        System.out.println("3");
        getBtn(nameField).sendKeys(new String[]{name});
        timeLapse(2000);
        System.out.println("4");
        performTap(passwordBtn);
        timeLapse(2000);
        System.out.println("5");
        driver.findElement(By.xpath(passwordFieldxpath)).sendKeys(new String[]{password});;
        System.out.println("6");
        timeLapse(2000);

        performTap(loginSubmitBtn);
    }

    public static void eliminatePopUps(){
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();
////        driver.findElement(By.id("android:id/ok")).click();
//        timeLapse(4000);
//        driver.findElement(By.id("com.shopee.ar:id/btn")).click();
//        //wait 5 seconds
//        timeLapse(9000);
//        driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();
//



    }
    private static TouchAction performTap(PointOption pointOption) {
        return touchAction.tap(pointOption).perform();
    }

    private static WebElement getBtn(String id) {
        return driver.findElement(By.id(id));
    }
    private static void timeLapse(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
