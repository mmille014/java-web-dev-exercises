package org.launchcode.java.demos.lsn5unittesting.test;

import org.launchcode.java.demos.lsn5unittesting.main.Car;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {assertEquals(10,10);}

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void gasTankLevelTest() {
        Car car = new Car("Ford", "F150", 50, 10);
        assertEquals(50.0, car.getGasTankLevel(), 0.0);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void drivingWithinGasLevelTest() {
        Car car = new Car("Ford", "F150",50,10);
        car.drive(10);
        assertEquals(49.0, car.getGasTankLevel(), 0.0);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range


    //TODO: can't have more gas than tank size, expect an exception

}
