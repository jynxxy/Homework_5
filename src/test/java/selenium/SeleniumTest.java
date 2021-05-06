package selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeleniumTest extends SeleniumTestBase {

    @Test
    public void shouldOpenGoogleWebsite() {
        getDriver().get("https://www.google.com/");
        Assertions.assertEquals(getDriver().getCurrentUrl(), "https://www.google.com/");
    }

    @Test
    public void shouldOpenGoogleWebsiteAndFail() {
        getDriver().get("https://www.google.com/");
        Assertions.assertEquals(2, 4);
    }
}
