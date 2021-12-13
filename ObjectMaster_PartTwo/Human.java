public class Human {
    
    public int health = 100;
    public int strength = 3;
    public int stealth = 3;
    public int intelligence = 3;
    public String name = "";

    public Human() {

    }
    public Human(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void attack(Human human) {
        human.health -= strength;

        System.out.printf("%s attack %s making their health %d.\n",this.getName(),human.getName(),human.getHealth());
    }

    
}
