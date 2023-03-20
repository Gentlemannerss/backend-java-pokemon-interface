import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");

    // ---------------------- Constructor ------------------
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "fire";
    }

    List<String> getAttacks() {
        return attacks;
    }

    // --------------------- Attacks --------------------
    void fireLash(Pokemon name, Pokemon enemy) {
        damage = 20;
        System.out.println("The pokemon uses Fire Lash, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        /* ---- This would only damage the pokemon that uses the move. (usefully for confusion)
        name.Hp -= damage;
        System.out.println("Your " + name.getName() + " now has " + name.getHp() + " HP.");
        */
    }
    void flameThrower(Pokemon name, Pokemon enemy) {
        damage = 40;
        System.out.println("The pokemon uses Flamethrower, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    void pyroBall(Pokemon name, Pokemon enemy) {
        damage = 30;
        System.out.println("The pokemon uses Pyro Ball, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    void inferno(Pokemon name, Pokemon enemy) {
        damage = 25;
        System.out.println("The pokemon uses Inferno, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
}
