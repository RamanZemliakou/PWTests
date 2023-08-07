import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class FirstTest extends PlaywrightRunner{
    @Test
    public void firstTest(){
        page.navigate(getProperty("url"));
        page.locator("a:has-text(\"Deal of the Day\")").click();

        System.out.println("OK");
    }
}
