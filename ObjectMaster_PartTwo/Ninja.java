public class Ninja extends Human{
    public Ninja(String name) {
        this.name = name;
        stealth = 10;
    }
    public void steal(Human human) {
        human.health -= stealth;
        health += stealth;
        System.out.printf("After stealing from %s, %s has %d health.\n",human.getName(),name,health);
    }

    public void runAway() {
        health -= 10;
        System.out.printf("%s runs away.\n",name);
    }
}
