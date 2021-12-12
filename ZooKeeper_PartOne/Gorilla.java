public class Gorilla extends Mammal {
    Mammal energyLevel;
    
    public int throwSomething(String gorilla) {
        System.out.printf("%s threw a boulder",gorilla);
        return energyLevel -= 5;
    }

    public int eatBananas(String gorilla) {
        System.out.printf("%s is super happy now that he has bananas.");
        return energyLevel += 10;
    }
}
