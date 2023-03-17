import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return "fire";
    }

    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
}
