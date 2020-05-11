package exercises.technology;

public class Smartphone extends Laptop {

    private String carrier;
    private int dataPlanMB;
    private double monthlyCharge;

    public Smartphone(String name, String manufacturer, String model, String operatingSystem, int screenSize, double maxBatteryLifeHours, String carrier, int dataPlanMB, double monthlyCharge) {
        super(name, manufacturer, model, operatingSystem, screenSize, maxBatteryLifeHours);
        this.carrier = carrier;
        this.dataPlanMB = dataPlanMB;
        this.monthlyCharge = monthlyCharge;
    }

    public Smartphone(String operatingSystem, String carrier) {
        super(operatingSystem);
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String aCarrier) {
        this.carrier = aCarrier;
    }

    public int getDataPlanMB() {
        return dataPlanMB;
    }

    public void setDataPlanMB(int aDataPlanMB) {
        this.dataPlanMB = aDataPlanMB;
    }

    public void changePhonePlan(String carrier, int dataPlanMB, double monthlyCharge) {
        this.carrier = carrier;
        this.dataPlanMB = dataPlanMB;
        this.monthlyCharge = monthlyCharge;
    }
}
