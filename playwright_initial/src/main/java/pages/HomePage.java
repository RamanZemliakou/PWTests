package pages;

import com.microsoft.playwright.Page;
import services.EnvironmentReaderService;

public class HomePage {
    private final Page homePage;
    public HomePage(Page page){
        this.homePage = page;
    }
    public void navigate(){
        homePage.navigate(EnvironmentReaderService.getProperty("url"));
    }
}
