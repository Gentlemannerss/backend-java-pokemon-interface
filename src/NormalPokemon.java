import java.util.Arrays;
import java.util.List;

public class NormalPokemon extends Pokemon {

    int damage;
    List<String> attacks = Arrays.asList("tackle", "hyperbeam", "bodyslam", "headbutt");

    // ---------------------- Constructor ------------------
    public NormalPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    // ---------------------  Getters & Setters --------------
    public String getType() {
        return "normal";
    }

    List<String> getAttacks() {
        return attacks;
    }

    // --------------------- Attacks --------------------
    void tackle(Pokemon name, Pokemon enemy) {
        damage = 20;
        System.out.println("The pokemon uses Tackle, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    void hyperBeam(Pokemon name, Pokemon enemy) {
        damage = 40;
        System.out.println("The pokemon uses Hyper Beam, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    void bodySlam(Pokemon name, Pokemon enemy) {
        damage = 30;
        System.out.println("The pokemon uses Pyro Ball, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    void headbutt(Pokemon name, Pokemon enemy) {
        damage = 25;
        System.out.println("The pokemon uses Inferno, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
}

