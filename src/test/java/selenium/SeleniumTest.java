package selenium;

import org.junit.Assert;
import org.junit.Test;

public class SeleniumTest extends SeleniumTestBase {

    @Test
    public void shouldOpenGoogleWebsite() {
        getDriver().get("https://www.google.com/");
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.google.com/");
    }

    @Test
    public void shouldOpenGoogleWebsiteAndFail() {
        getDriver().get("https://www.google.com/");
        Assert.assertEquals(2, 4);
    }
}
