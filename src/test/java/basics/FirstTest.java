package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void thisIsMyFirstTest() {

        Assertions.assertEquals("qwe", "qwe");
        Assertions.assertEquals(2, 2);
        Assertions.assertTrue(false);
        System.out.println(">>>>This is my first test");
    }

    @Test
    public void thisIsMySecondTest() {
        int i = 2;
        Assertions.assertEquals(i, 2);
        Assertions.assertEquals(2, 3);
        System.out.println(">>>>This is my second test!!!");
    }

    @Test
    public void thisIsMyThirdTest() {
        Assertions.assertEquals("qwe", "qwe");
        Assertions.assertEquals(2, 2);
        System.out.println(">>>>This is my third test!!!");
    }
}
