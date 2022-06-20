import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
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
        System.out.println("Appium driver initialized");
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


}
