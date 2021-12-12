public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        Gorilla gorilla2 = new Gorilla();

        gorilla.displayEnergy();
        gorilla2.displayEnergy();

        gorilla.throwSomething();
        gorilla2.throwSomething();

        gorilla.climb();
        gorilla.climb();
        gorilla2.climb();

        gorilla.eatBananas();
        gorilla2.eatBananas();

        gorilla.displayEnergy();
        gorilla2.displayEnergy();

    }
}
