package exercises.technology;

import java.util.UUID;

public class Computer extends AbstractIdentity{

    private String name;
    private String manufacturer;
    private String model;
    private String operatingSystem;
    private boolean powered;
    private boolean online;

    //constructor(s)
    public Computer(String name, String manufacturer, String model, String operatingSystem) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public Computer() {

    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String aManufacturer) {
        this.manufacturer = aManufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String aModel) {
        this.model = aModel;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String aOperatingSystem) {
        this.operatingSystem = aOperatingSystem;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean aPowered) {
        this.powered = aPowered;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean aOnline) {
        this.online = aOnline;
    }

    //instance methods
    public void bootUp() {
        powered = true;
        online = true;
    }

    public void shutDown() {
        powered = false;
        online = false;
    }

    @Override
    public UUID generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
}
