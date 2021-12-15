public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber,batteryPercentage,carrier,ringTone);
    }
    @Override
    public String ring(){
        String version = super.getVersionNumber();
        String ringTone = super.getRingTone();
        return String.format("Galaxy %s says %s!", version, ringTone);
    }
    @Override
    public String unlock() {
        return "Unlocking via finger print";
    }
    @Override
    public void displayInfo() {
        String version = super.getVersionNumber();
        String carrier = super.getCarrier();
        int batteryPerc = super.getBatteryPercentage();
        String infoString = String.format("Galaxy %s from %s has %d%% battery.",version,carrier,batteryPerc);
        System.out.println(infoString);
    }
}
