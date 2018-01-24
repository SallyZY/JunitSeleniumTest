package junit_test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by yingzhang on 14/12/2017.
 */
public class testcase1 {

    private static WebDriver webDriver;

    public static WebDriver getDriver(){
        if(webDriver==null){;
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return webDriver;
    }

    public static void deleteWebDriver(){
        if (webDriver != null){
            webDriver = null;
        }
    }

    @Test
    public void test_1(){
        getDriver().manage().deleteAllCookies();
        getDriver().navigate().to("http://www.baidu.com");
        System.out.println("test_1");
    }

    @Test
    public void test_2(){
        System.out.println("test_2");
    }

    @Before
    public void beforeTest() {

//        getDriver().manage().deleteAllCookies();
    }

    @After
    public void afterTest(){
        getDriver().manage().deleteAllCookies();
        getDriver().quit();
        deleteWebDriver();
    }
}
