import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOpenPage {

    @Test
    public void test() {
        /*
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("http://hwsw.hu");

        assertEquals("HWSW Informatikai Hírmagazin", driver.getTitle());
         */

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://hwsw.hu");

        assertEquals("HWSW Informatikai Hírmagazin", driver.getTitle());

    }
}
