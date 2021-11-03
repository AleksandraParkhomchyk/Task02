package by.tc.task01;

import by.tc.task01.entity.Oven;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    public void test_oven_default_constructor() {
        Oven testClass = new Oven(5, 5, 5, 5, 5, 5, 5);

        assertEquals(5, testClass.getPowerConsumption());
        assertEquals(5, testClass.getWeight());
        assertEquals(5, testClass.getCapacity());
        assertEquals(5, testClass.getDepth());
        assertEquals(5, testClass.getWeight());


    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
