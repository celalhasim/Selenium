package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {

    public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        // biz driver objesi oluşturduğumzda boş bir browser açılır.

        driver.get("https://www.amazon.com");

        Thread.sleep(3000);

        driver.close();
    }
}
