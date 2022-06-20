import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class Test {

    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            testSomething();
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

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Appium driver initialized");
    }

    public void testLogin(){
        driver.findElement(By.id("00000000-0000-01c8-ffff-ffff0000002f")).click();
        driver.findElement(By.id("00000000-0000-01c8-ffff-ffff000005d9")).click();
    }
}
