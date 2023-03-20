import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    int damage;
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leafblade");

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
        damage = 30;
        System.out.println("The pokemon uses Leaf Storm, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        damage = 40;
        System.out.println("The pokemon uses Solar Beam, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        damage = 15;
        System.out.println("The pokemon uses Leech Seed.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        name.Hp += damage;
        System.out.println("Name " + name.getName() + " now has " + name.getHp() + " HP.");
    }
    public void leafBlade(Pokemon name, Pokemon enemy) {
        damage = 25;
        System.out.println("The pokemon uses Leaf Blade, and deals " + damage + " damage.");
        enemy.Hp -= damage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
    }

}
