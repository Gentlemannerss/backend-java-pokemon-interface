import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    // ---------------------- Constructor ------------------
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "grass";
    }

    List<String> getAttacks() {
        return attacks;
    }

    // --------------------- Attacks --------------------
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println("The pokemon uses Thunder Punch.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }

}
