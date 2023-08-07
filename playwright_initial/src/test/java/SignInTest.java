import org.junit.jupiter.api.Test;
import pages.AccountEntries;

public class SignInTest extends PlaywrightRunner{
    @Test
    public void signInExistingUser(){
        homePage.navigate();
        accountNavigationPage.navigateTo(AccountEntries.SIGN_IN);
        signInPage.signIn(getProperty("email"), getProperty("password"));
        homePage.checkWeAreOnHomePage();
//        System.out.println("OK");
    }
}
