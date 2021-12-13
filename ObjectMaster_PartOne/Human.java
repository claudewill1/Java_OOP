public class Human {
    private int health = 100;
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private String name = "";

    public Human() {

    }
    public Human(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
    public void attack(Human human) {
        human.health -= strength;

        System.out.printf("%s attack %s making their health %d.\n",this.getName(),human.getName(),human.getHealth());
    }
}
