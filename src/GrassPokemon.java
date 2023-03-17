import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final String type = "grass";
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return type;
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }

}
