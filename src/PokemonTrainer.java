import java.util.List;

public class PokemonTrainer {
    private final String name;
    private final List<Pokemon> pokemons;

    // ---------------- Constructor ---------------
    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    // -------------------- Getters --------------
    public String getName() {
        return name;
    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
