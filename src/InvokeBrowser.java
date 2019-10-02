import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser
{
    public WebDriver invokeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\iulusoy\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver ibrahim=new ChromeDriver();
        return ibrahim;

    }
}
