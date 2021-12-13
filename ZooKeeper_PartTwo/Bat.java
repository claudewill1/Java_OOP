public class Bat extends Mammal{
    
    public Bat() {
        energyLevel = 300;
    }
    public void fly() {
        System.out.println("sound of bat taking off flying");
        energyLevel -= 50;
    }
    public void eatHumans() {
        energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("Sound of town burning");
        energyLevel -= 100;
    }
}