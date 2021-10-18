import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Task {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        Configuration.startMaximized=true;
        Selenide.open( "https://en.wikipedia.org/wiki/Main_Page");
        $(byName("search")).setValue("java programming language");
        $(byClassName("searchButton")).click();
        sleep(6000);
    }
}
