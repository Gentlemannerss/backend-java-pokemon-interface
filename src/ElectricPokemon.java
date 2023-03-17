import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public String getType() {
        return "electric";
    }

    List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
    }
    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Electro Ball.");
    }
    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder.");
    }
    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Volt Tackle.");
    }
}
