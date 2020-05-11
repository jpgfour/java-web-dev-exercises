package exercises.technology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {

    @Test
    public void bootsUpCorrectly(){
        Laptop testLaptop = new Laptop("testy","Tandy","T-1000","MS-DOS",17,6);
        testLaptop.bootUp();
        assertEquals(true, testLaptop.isOnline() && testLaptop.isPowered());
    }

    @Test
    public void shutsDownCorrectly(){
        Laptop testLaptop = new Laptop("testy","Tandy","T-1000","MS-DOS",17,6);
        testLaptop.shutDown();
        assertEquals(true, !testLaptop.isOnline() && !testLaptop.isPowered());
    }

    @Test
    public void chargeUpCorrectly(){
        Laptop testLaptop = new Laptop("testy","Tandy","T-1000","MS-DOS",17,6);
        testLaptop.setCurrentBatteryLifeHours(0);
        testLaptop.chargeUp();
        assertEquals(true, testLaptop.getCurrentBatteryLifeHours() == testLaptop.getMaxBatteryLifeHours () && testLaptop.isPluggedIn() && testLaptop.getPercentCharged() == 100);
    }

}
