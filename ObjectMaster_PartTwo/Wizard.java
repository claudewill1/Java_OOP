public class Wizard extends Human{
    
    
    public Wizard(String name) {
        this.name = name;
        health = 50;
        intelligence = 8;
        
    }
    public void heal(Human human) {
        human.health += intelligence;
        System.out.printf("%s heals %s raising their health to %d.\n",name,human.getName(),human.getHealth());
    }

    public void fireball(Human human) {
        human.health -= (intelligence*3);
        System.out.printf("%s shoots a fireball at %s reducing their health to %d.\n",name,human.getName(),human.getHealth());
    }
}
