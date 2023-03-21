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

    // ---------------------- Type Damage Calculator ---------------

    public int damageCalculator(Pokemon name, Pokemon enemy, int damage) {
        switch (enemy.getType()) {
            case "water", "ground", "rock" -> damage *= 2;
            case "fire", "grass", "poison", "flying", "bug", "dragon", "steel" -> damage /= 2;
            default -> {}
        }
        return damage;
    }

    // --------------------- Attacks --------------------
    public void leafStorm(Pokemon name, Pokemon enemy) {
        damage = 30;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Leaf Storm, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    public void solarBeam(Pokemon name, Pokemon enemy) {
        damage = 40;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Solar Beam, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    public void leechSeed(Pokemon name, Pokemon enemy) {
        damage = 15;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Leech Seed, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        name.Hp += totalDamage;
        System.out.println("Name " + name.getName() + " now has " + name.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    public void leafBlade(Pokemon name, Pokemon enemy) {
        damage = 25;
        int totalDamage = damageCalculator(name, enemy, damage);
        System.out.println("The pokemon uses Leaf Blade, and deals " + totalDamage + " damage.");
        enemy.Hp -= totalDamage;
        System.out.println("Enemy " + enemy.getName() + " now has " + enemy.getHp() + " HP.");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
}
