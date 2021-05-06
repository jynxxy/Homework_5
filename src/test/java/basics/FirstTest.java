package basics;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void thisIsMyFirstTest() {
        Assert.assertEquals("qwe", "qwe");
        Assert.assertEquals(2, 2);
        Assert.assertTrue(false);
        System.out.println(">>>>This is my first test");
    }

    @Test
    public void thisIsMySecondTest() {
        int i = 2;
        Assert.assertEquals(i, 2);
        Assert.assertEquals(2, 3);
        System.out.println(">>>>This is my second test!!!");
    }

    @Test
    public void thisIsMyThirdTest() {
        Assert.assertEquals("qwe", "qwe");
        Assert.assertEquals(2, 2);
        System.out.println(">>>>This is my third test!!!");
    }
}
