public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber,batteryPercentage,carrier,ringTone);
    }
    @Override
    public String ring(){
        String version = getVersionNumber();
        String ringTone = getRingTone();
        String ringString = String.format("iPhone %s says %s!", version,ringTone);
        return ringString;
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        String version = super.getVersionNumber();
        String carrier = super.getCarrier();
        int batteryPerc = super.getBatteryPercentage();
        String output = String.format("iPhone %s from %s has %d%% battery.",version,carrier,batteryPerc);
        System.out.println(output);
    }
}
