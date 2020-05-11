package exercises.technology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartphoneTest {

    @Test
    public void bootsUpCorrectly(){
        Smartphone testPhone = new Smartphone("iOS","Verizon");
        testPhone.bootUp();
        assertEquals(true, testPhone.isOnline() && testPhone.isPowered());
    }

    @Test
    public void shutsDownCorrectly(){
        Smartphone testPhone = new Smartphone("iOS","Verizon");
        testPhone.shutDown();
        assertEquals(true, !testPhone.isOnline() && !testPhone.isPowered());
    }

    @Test
    public void chargeUpCorrectly(){
        Smartphone testPhone = new Smartphone("iOS","Verizon");
        testPhone.setCurrentBatteryLifeHours(0);
        testPhone.chargeUp();
        assertEquals(true, testPhone.getCurrentBatteryLifeHours() == testPhone.getMaxBatteryLifeHours () && testPhone.isPluggedIn() && testPhone.getPercentCharged() == 100);
    }

    @Test
    public void changePlanCorrectly(){
        Smartphone testPhone = new Smartphone("iOS","Verizon");
        testPhone.changePhonePlan("AT&T",2000,139.99);
        assertEquals(true,testPhone.getCarrier() == "AT&T" && testPhone.getDataPlanMB() == 2000 && testPhone.getMonthlyCharge() == 139.99);
    }

}
