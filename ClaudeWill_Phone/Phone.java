public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // getters and setters
    public String getVersionNumber() {
        return this.versionNumber;
    }
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public String getRingTone() {
        return this.ringTone;
    }
    public void setVersionNumber(String versionNumber){
        this.versionNumber = versionNumber;
    }
    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    // abstract method to display device info
    public abstract void displayInfo();
}
