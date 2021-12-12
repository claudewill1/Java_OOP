public class Gorilla extends Mammal {
    
    public void throwSomething() {
        System.out.println("The gorilla threw a boulder");
        energyLevel -= 5;
    }
    

    public void eatBananas(){
        System.out.println("The gorilla super happy now that he has bananas.");
        energyLevel += 10;
    }
    

    public void climb() {
        System.out.println("The gorilla climbed a tree");
        energyLevel -= 1;
    }
}
