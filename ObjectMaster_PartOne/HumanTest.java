public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human("RangerBob");
        Human human2 = new Human("MageHarry");

       
        human1.attack(human2);
        human2.attack(human1);
        human1.attack(human2);
        human1.attack(human2);
        human1.attack(human2);
        human2.attack(human1);

            
        

        
    }
}
