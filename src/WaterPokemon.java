import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    // ---------------------- Constructor ------------------
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "water";
    }

    List<String> getAttacks() {
        return attacks;
    }

    // --------------------- Attacks --------------------
    void surf(Pokemon name, Pokemon enemy) {
        damage = 30;
        System.out.println("The pokemon uses Surf, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");

    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        damage = 25;
        System.out.println("The pokemon uses Hydro Pump, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        damage = 40;
        System.out.println("The pokemon uses Hydro Cannon, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        damage = 5;
        System.out.println("The pokemon uses Rain Dance.");
        if (enemy.getType().equals("electric")) {
            System.out.println("This has no effect on the " + enemy.getName());
        } else if (enemy.getType().equals("grass")) {
            enemy.Hp += damage;
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP thanks to Rain Dance.");
        } else {
            enemy.Hp -= damage;
            System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        }
    }
}
