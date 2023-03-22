import java.util.List;

public interface PokemonGym {

    void enteredTheGym(PokemonTrainer player1);

    void printPokemon(List<Pokemon> pokemons);

    Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);

    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);

    Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);

    Pokemon choosePokemon(PokemonTrainer trainer);

    int randomAttackByGymOwner();

    String chooseAttackPlayer(Pokemon p);

    void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack, PokemonTrainer trainer, PokemonGymOwner owner);

    void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon, PokemonTrainer trainer, PokemonGymOwner owner);

    void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);
}
