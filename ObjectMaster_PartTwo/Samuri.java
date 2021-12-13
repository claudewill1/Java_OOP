public class Samuri extends Human {
    private static int samuriCount;
    
    public Samuri(String name) {
        this.name = name;
        health = 200;
        samuriCount++;
    }

    public void deathBlow(Human human) {
        human.health = 0;
        health /= 2;
        System.out.printf("%s deals a death blow to %s killing them instantly.\n",name,human.getName());
    }

    public void meditate() {
        health += (health/2);
        System.out.printf("%s meditates raising their health to %d.\n",name,health);
    }

    public static int howMany() {
        return samuriCount;
    }
}
