public interface Ringable {
    public default String ring(){
        return "ringing";
    }
    public default String unlock() {
        return "Phone unlocked";
    }
}
