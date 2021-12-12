public class Mammal {
    private int energyLevel;
    private String name;
    public Mammal() {
        this.energyLevel = 100;
    }
    public Mammal(String name) {
        this.name = name;
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }
}
