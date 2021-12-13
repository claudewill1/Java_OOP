public class ClassInteractionTest {
    public static void main(String[] args) {
        Wizard bob = new Wizard("Bob");
        Ninja tom = new Ninja("NinjaTom");
        Samuri glenn = new Samuri("Glenn the Magic Samuri");
        Samuri abby = new Samuri("Abby");
        Samuri jessica = new Samuri("jessica");
        bob.heal(tom);
        bob.heal(tom);
        bob.fireball(glenn);
        bob.heal(glenn);
        bob.fireball(tom);

        tom.steal(bob);
        tom.steal(glenn);

        glenn.deathBlow(tom);
        glenn.meditate();
        
        System.out.printf("There are %d Samuri.",Samuri.howMany());
    }
}
