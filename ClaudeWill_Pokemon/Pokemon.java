public class Pokemon {
    private String name;
    private String type;
    private int health;

    private static int count = 0;

    public Pokemon() {
        
    }
    public void attackPokemon(Pokemon pokemon) {
        pokemon.health -= 10;
    }
}
