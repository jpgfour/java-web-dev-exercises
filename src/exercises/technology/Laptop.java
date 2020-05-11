package exercises.technology;

public class Laptop extends Computer {

    private boolean pluggedIn;
    private double maxBatteryLifeHours;
    private double currentBatteryLifeHours;
    private int screenSize;
    private double percentCharged;

    public Laptop(String aName, String aManufacturer, String aModel, String aOperatingSystem, int aScreenSize, double aMaxBatteryLifeHours) {
        super(aName, aManufacturer, aModel, aOperatingSystem);
        maxBatteryLifeHours = aMaxBatteryLifeHours;
        screenSize = aScreenSize;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean aPluggedIn) {
        this.pluggedIn = aPluggedIn;
    }

    public double getMaxBatteryLifeHours() {
        return maxBatteryLifeHours;
    }

    public void setMaxBatteryLifeHours(double aMaxBatteryLifeHours) {
        this.maxBatteryLifeHours = aMaxBatteryLifeHours;
    }

    public double getCurrentBatteryLifeHours() {
        return currentBatteryLifeHours;
    }

    public void setCurrentBatteryLifeHours(double aCurrentBatteryLifeHours) {
        this.currentBatteryLifeHours = aCurrentBatteryLifeHours;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int aScreenSize) {
        this.screenSize = aScreenSize;
    }

    public double getPercentCharged() {
        return percentCharged;
    }

    public void setPercentCharged(double aPercentCharged) {
        this.percentCharged = aPercentCharged;
    }

    public void chargeUp() {
        this.setPluggedIn(true);
        this.currentBatteryLifeHours = maxBatteryLifeHours;
        this.percentCharged = 100;
    }
}
