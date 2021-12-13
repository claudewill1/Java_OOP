public class Samuri extends Human {
    private int samuriCount;
    public Samuri() {
        health = 200;
    }

    public void deathBLow(Human human) {
        human.health = 0;
        health /= 2;
    }

    public void meditate() {
        health += (health/2);
    }

    public int howMany() {
        return samuriCount;
    }
}
