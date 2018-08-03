

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class StartApp {
        public static AndroidDriver<WebElement> driver;
        public static void main( String[] args )
        {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "EQ7TBU6T99999999");
            capabilities.setCapability("udid", "EQ7TBU6T99999999");
            // 设置每次运行不重新启动被测试app
            capabilities.setCapability("fullReset", "false");
            capabilities.setCapability("noReset", "true");
            // 设置安卓系统版本
            //capabilities.setCapability("automationName","uiautomator2");
            capabilities.setCapability("platformVersion", "5.1");
            capabilities.setCapability("platformName", "Android");
            // session 延迟时间
            capabilities.setCapability("newCommandTimeout", 24000);
            capabilities.setCapability("noReset", true);
            capabilities.setCapability("device", "selendroid");
            // capabilities.setCapability("app", app.getAbsolutePath());
            capabilities.setCapability("unicodeKeyboard", "True");
            capabilities.setCapability("resetKeyboard", "True");
            // 设置app的主包名和主类名 微信程序包名和activity 名
            capabilities.setCapability("appPackage", "com.paxunke.linkme");
            capabilities.setCapability("appActivity", "com.paxunke.linkme.LoadingActivity");

            String url = "http://0.0.0.0:4723/wd/hub";

            // 启动
            try {
                System.out.println(url);
                driver = new AndroidDriver<WebElement>(new URL(url), capabilities);

            } catch (Exception e) {

                e.printStackTrace();
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            driver.findElementByAndroidUIAutomator("text(\"我的\")").click();

            driver.findElementById("com.paxunke.linkme.app.w:id/tv_click_online_title").click();


        }


    }
