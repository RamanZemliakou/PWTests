import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class FirstTest extends PlaywrightRunner{
    @Test
    public void firstTest(){
        page.navigate(getProperty("url"));
        Locator menuItems = page.locator("ul.bottom-nav-left li a");

        for (int i = 0; i < menuItems.count(); i++)
            System.out.println(menuItems.nth(i).textContent());

        page.locator("ul.bottom-nav-left li a", new Page.LocatorOptions().setHasText("Deal of the Day")).click();

        System.out.println("OK");
    }
}
