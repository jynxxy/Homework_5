package basics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestBase {

    @Before
    public void setup() {
        System.out.println("I was run before each test");
    }

    @After
    public void cleanUp() {
        System.out.println("I was run after each test");
    }

    @BeforeClass
    public static void runOnceBeforeAll() {
        System.out.println("I was run once before all tests");
    }

    @AfterClass
    public static void runOnceAfterAll() {
        System.out.println("I was run once after all tests");
    }
}
