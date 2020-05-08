package exercises.technology;

public class Laptop extends Computer {

    private boolean pluggedIn;
    private double batteryLifeHours;
    private double percentCharged;

    public Laptop(String name, String manufacturer, String model, String operatingSystem) {
        super(name, manufacturer, model, operatingSystem);
    }

}
