package org.launchcode.java.demos.lsn5unittesting.test;

import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static junit.framework.Assert.*;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
//    public void testInitialGasTank() {
//        //Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//    }
//    public void testInitialGasTank() {
//        assertFalse(test_car.getGasTankLevel() == 0);
//    }
    public void testInitialGasTank() {
        assertTrue(test_car.getGasTankLevel() != 0);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
