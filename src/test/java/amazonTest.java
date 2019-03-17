import com.amazon.pageObjects.BannerDetails;
import com.amazon.pageObjects.HomePage;
import com.amazon.pageObjects.Login;
import com.amazon.pageObjects.PincodeChange;
import org.testng.annotations.Test;

import java.io.IOException;

public class amazonTest {


    @Test
    public void testPincode() throws InterruptedException, IOException {

        PincodeChange.changePincode();

    }

    @Test
    public void testBanner() throws IOException {

        BannerDetails.bannercount();
    }

    @Test
    public void testLogin() throws InterruptedException, IOException {

        Login.logindetails();
    }

    @Test
    public void testSignup() throws IOException {

        HomePage.signUp();
    }


}
